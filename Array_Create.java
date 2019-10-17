import java.util.Scanner;

public class Array_Create {
    Scanner scan = new Scanner( System.in );
    public static int[] array;
    public static int count = 0;

    void show_menu() {
        System.out.print( "\n1. Создать массив\n" +
                "2. Узнать количество элементов и информацию о них\n" +
                "3. Добавить элемент\n" +
                "4. Удалить элемент\n" +
                "5. Узнать элемент по индексу\n" +
                "6. Удалить вводимый элемент\n" +
                "7. Сделать вставку по индексу\n" +
                "8. Найти элемент\n" +
                "9. Сортировка массива\n" +
                "10. Выход\n");
    }

    void array_create( int func_size ) {
        count = 0;

        array = new int[func_size];

        System.out.print( "Введите элементы массива: " );
        for (int i = 0; i < func_size; i++) {
            array[i] = scan.nextInt();
            count++;
        }
    }

    void array_show() {
        System.out.print( "Элементы массива: " );
        for (int i = 0; i < count; i++) System.out.print(array[i] + " ");

        System.out.print( "\nВсего " + count + " элементов\n" );
    }

    void get_item() {
        int index_num;

        if (count == 0) {
            System.out.print("Массив пуст! Выбирете первый пункт дял создания массива.\n");
            return;
        }

        do{
            System.out.print("Введите индекс элемента: ");
            index_num = scan.nextInt();
            scan.nextLine();

            if (index_num > count || index_num <= 0) System.out.print("Вы ввели индекс меньше 1 или превышающий размер массива!\n");
            else break;
        }while (index_num > count || index_num <= 0);

        if (index_num > count ) {
            System.out.print("Вы ввели индекс, превышающий размер массива либо массив пуст!" +
                    "Выбирете второй пункт, чтобы узнать количество элементов, или первый пункт, чтобы создать массив.\n");
            return;
        }
        System.out.print( "Это элемент " + array[index_num - 1] + '\n' );
    }
    void add_item() {
        System.out.print("Введите элемент, который хотите добавить: ");
        int[] pocket_array = new int[count];
        int pocket_count = count + 1;

        int added_item = scan.nextInt();

        for (int i = 0; i < count; i++) pocket_array[i] = array[i];

        array = new int[pocket_count];

        for (int i = 0; i < pocket_count; i++) {
            if (i < count) array[i] = pocket_array[i];
            else array[i] = added_item;
        }

        count++;
    }

    void del_item() {
        System.out.print("Удаление элемента массива\n");
        int pocket_count = count - 1;
        int index;
        int deleted_item = 0;

        if (count == 0) {
            System.out.print("Массив пуст! Выбирете первый пункт для создания массива.\n");
            return;
        }

        do {
            System.out.print("Введите индекс элемента, который хотите удалить: ");
            index = scan.nextInt();

            if (index > count) System.out.print("Вы ввели индекс, превышающий размер массива!\n");
            else if (index < 0) System.out.print("Вы ввели индекс меньше 1.\n");
            else break;
        }while (index > count || index <= 0);

        int[] left_array = new int[index - 1];
        int[] right_array = new int[count - index];

        for (int i = 0; i < count; i++) {
            if (i < index - 1) left_array[i] = array[i];
            else if (i > index - 1) right_array[i - index] = array[i];

            deleted_item = array[index - 1];
        }

        array = new int[pocket_count];

        for (int i = 0; i < count; i++) {
            if (i < index - 1) array[i] = left_array[i];
            else if(i > index - 1) array[i - 1] = right_array[i - index];
        }

        count--;

        System.out.print("Удаленный элемент: " + deleted_item);
    }

    void input_del() {
        int del_count = 0;
        int del_index = 0;
        int del_item;
        boolean check = false;

        if (count == 0) {
            System.out.print("Массив пуст! Выбирете первый пункт для создания массива.\n");
            return;
        }

        do {
            System.out.print("Ввеидет элемент, который вы хотите удалить: ");
            del_item = scan.nextInt();

            for (int i = 0; i < count; i++) {
                if (array[i] == del_item) check = true;
            }

        }while(check == false);

        for (int i = 0; i < count; i++) {
            if (array[i] == del_item) {
                System.out.print("Индекс: " + (i + 1) + " Элемент: " + array[i] + '\n');
                del_count++;
            }
        }

        int[] pocket_array = new int[count - del_count];

        for (int i = 0; i < count; i++) {
            if (array[i] != del_item) {
                pocket_array[del_index] = array[i];

                del_index++;
            }
        }

        array = new int[count - del_count];

        for (int i = 0; i < (count - del_count); i++) {
            array[i] = pocket_array[i];
        }

        count -= del_count;
    }

    void index_add() {
        int pocket_count = 0;
        int index;

        do {
            System.out.print("Введите индекс для вставки: ");
            index = scan.nextInt();
            scan.nextLine();

            if (index > count) System.out.print("Вы ввели индекс, превышающий размер массива!\n");
            if (index < 0) System.out.print("Вы ввели индекс меньше 0.\n");
            else break;
        }while (index > count || index < 0);

        System.out.print("Введите один или несколько элементов через пробел для вставки: ");

        String str = scan.nextLine();
        String[] str_array = str.split(" ");

        for (String s : str_array) pocket_count++;

        int[] pocket_array = new int[pocket_count];

        for (int i = 0; i < pocket_count; i++) pocket_array[i] = Integer.parseInt(str_array[i]);

        int[] left_array = new int[index];
        int[] right_array = new int[count - index];

        for (int i = 0; i < count; i++) {
            if (i < index) left_array[i] = array[i];
            else right_array[i - index] = array[i];
        }

        array = new int[count + pocket_count];

        for (int i = 0; i < count + pocket_count; i++) {
            if (i < index) array[i] = left_array[i];
            else if (i < index + pocket_count) array[i] = pocket_array[i - index];
            else array[i] = right_array[i - (index + pocket_count)];
        }

        count += pocket_count;
    }
}

