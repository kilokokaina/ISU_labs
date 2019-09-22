import java.util.Scanner;

class Array_Create {
    Scanner scan = new Scanner( System.in );
    public int[] array;
    public int count = 0;

    void show_menu() {
        System.out.print( "\n1. Создать массив\n" +
                "2. Узнать количество элементов и информацию о них\n" +
                "3. Добавить элемент\n" +
                "4. Удалить элемент\n" +
                "5. Узнать элемент по индексу\n" +
                "6. Сделать вставку по индексу\n" +
                "7. Выход\n" );
    }

    void array_create( int func_size ) {
        create : {
            count = 0;

            array = new int[func_size];

            System.out.print( "Введите элементы массива: " );
            for (int i = 0; i < func_size; i++) {
                array[i] = scan.nextInt();
                count++;
            }
        }
    }

    void array_show() {
        System.out.print( "Элементы массива: " );
        for (int i = 0; i < count; i++) System.out.print(array[i] + " ");

        System.out.print( "\nВсего " + count + " элементов\n" );
    }

    void get_item() {
        int index_num;

        System.out.print("Введите индекс элемента: ");
        index_num = scan.nextInt();
        scan.nextLine();

        if (index_num > count ) {
            System.out.print("Вы ввели индекс, превышающий размер массива либо массив пуст! +
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
        int[] pocket_array = new int[count];
        int pocket_count = count - 1;
        int deleted_item = 0;

        if (count == 0) {
            System.out.print("Массив пуст! Выбирете первый пункт для создания массива.\n");
            return;
        }

        for (int i = 0; i < count; i++) {
            pocket_array[i] = array[i];

            if (i == pocket_count) deleted_item = array[i];
        }

        array = new int[pocket_count];

        for (int i = 0; i < pocket_count; i++) array[i] = pocket_array[i];

        count--;

        System.out.print("Удаленный элемент: " + deleted_item);

    }

    void index_add() {
        int pocket_count = 0;
        int index;

        do {
            System.out.print("Введите индекс для вставки: ");
            index = scan.nextInt();
            scan.nextLine();

            if (index > count) System.out.print("Вы ввели индекс, превышающий размер массива!\n");
            else break;

        }while (index > count);

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
            else if (i >= index && i < index + pocket_count) array[i] = pocket_array[i - index];
            else array[i] = right_array[i - (index + pocket_count)];
        }

        count += pocket_count;
    }
}

