import java.util.Scanner;

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
                case 4:
                    main_array.del_item();
                    break;
                case 5:
                    main_array.get_item();
                    break;
                case 6:
                    main_array.index_add();
                    break;
                case 7:
                    break;
            }
        }while (choose != 7);
    }
}