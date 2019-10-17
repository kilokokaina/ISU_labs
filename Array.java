import java.util.Scanner;

public class Array {

    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );
        int main_size, choose;

        Array_Create main_array = new Array_Create();
        Dynamic_Array new_array = new Dynamic_Array();

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
                    main_array.input_del();
                    break;
                case 7:
                    main_array.index_add();
                    break;
                case 8:
                    new_array.check_in_mass();
                    break;
                case 9:
                    new_array.array_sort();
                    break;
                case 10:
                    break;
            }
        }while (choose != 10);
    }
}