import java.util.Random;
import java.util.Scanner;

public class Randomize {
    public static int rand(int max, int min) {
        max -= min;

        return (int) (Math.random() * max) + min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        Dynamic_Array main_array = new Dynamic_Array();
        Random random = new Random();
        int counter = 0;
        int user_number;

        int left_border = 1;
        int right_border = 100;

        int random_number = main_array.rand_array();

        do {
            user_number = rand(left_border, right_border);

            if (user_number < random_number) left_border = user_number;
            else if (user_number > random_number) right_border = user_number;
            else break;

            counter++;

        }while(user_number != random_number);

        System.out.print("Это число " + random_number + " за " + counter + " шагов");

    }
}
