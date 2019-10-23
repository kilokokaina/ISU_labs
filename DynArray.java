import java.util.Scanner;

public class DynArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Methods main_array = new Methods();
        int choose;

        do{
            main_array.show_menu();

            choose = scan.nextInt();

            switch (choose) {
                case 1:
                    main_array.array_create();
                    break;
                case 2:
                    main_array.array_show();
                    break;
                case 3:
                    main_array.array_sort();
                    break;
                case 4:
                    main_array.del_item();
                    break;
                case 5:
                    break;
                default:
                    System.out.print("Попробуйте ввести другое число\n");
                    break;
            }
        }while (choose != 5);
    }
}
