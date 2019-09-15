import java.util.Scanner;

class Array_Create {
    Scanner scan = new Scanner( System.in );
    public int[] array;
    public int count = 0;

    void show_menu() {
        System.out.print( "\n1. Создать массив\n" +
                "2. Узнать количество элементов и информацию о них\n" +
                "3. Добавить элемент\n" +
                "4. Удалить элемент(work in progress)\n" +
                "5. Узнать элемент по индексу\n" +
                "6. Сделать вставку по индексу(work in progress)\n" +
                "7. Выход\n" );
    }

    void array_create( int size ) {
        array = new int[size];

        System.out.print( "Введите элементы массива: " );
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
            count++;
        }
    }

    void array_show() {
        System.out.print( "Элементы массива: " );
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print( "\nВсего " + count + " элементов\n" );
    }

    void get_item() {
        System.out.print( "Введите индекс элемента: " );

        int index_num = scan.nextInt();

        for (int i = 1; i <= count; i++) {
            if (i  == index_num) System.out.print( "Это элемент " + array[i - 1] + '\n' );
        }
    }

    void add_item() {
        System.out.print("Введите элемент, который хотите добавить: ");
        int[] pocket_array = new int[count];
        int pocket_count = count + 1;

        int added_item = scan.nextInt();

        for (int i = 0; i < count; i++) {
            pocket_array[i] = array[i];
        }

        array = new int[pocket_count];

        for (int i = 0; i < count; i++) {
            array[i] = pocket_array[i];
        }

        for (int i = 0; i < pocket_count; i++) {
            if (i == count) {
                array[i] = added_item;
            }
        }

        for (int i = 0; i < pocket_count; i++) {
            System.out.print(array[i] + " ");
        }

        count++;
    }
}

public class Array {

    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );
        int main_size, choose;

        Array_Create main_array = new Array_Create();

        do {
            main_array.show_menu();
            choose = scan.nextInt();

            switch (choose) {
                case 1:
                    System.out.print( "Введите размер массива: " );
                    main_size = scan.nextInt();
                    main_array.array_create( main_size );
                    break;
                case 2:
                    main_array.array_show();
                    break;
                case 3:
                    main_array.add_item();
                    break;
                case 5:
                    main_array.get_item();
                    break;
                case 7:
                    break;
            }
        }while (choose != 7);
    }
}
