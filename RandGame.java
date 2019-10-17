import java.util.Scanner;

public class RandGame {
    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );
        Dynamic_Array main_array = new Dynamic_Array();
        int counter = 0;

        int rand_num = main_array.rand_array();

        System.out.print("У вас есть пять попыток чтобы угадать заданное число.\n");

        do{
            System.out.print("Введите свое число: ");
            int user_number = scan.nextInt();

            if (user_number < rand_num) System.out.print("Ваше число меньше загаданного\n");
            else if (user_number > rand_num) System.out.print("Ваше число больше загаданного\n");
            else {
                System.out.print("Вы угадали число!!!!\n");

                break;
            }

            counter++;

        }while (counter < 5);

        System.out.print("Это число " + " " + rand_num);
    }
}
