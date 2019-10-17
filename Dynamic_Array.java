import java.util.Random;
import java.util.Scanner;

public class Dynamic_Array extends Array_Create{
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    void check_in_mass() {
        boolean check = false;

        System.out.print("Введите элемент для проверки на его наличие: ");
        int item = scan.nextInt();

        for(int i = 0; i < count; i++) {
            if (item == array[i]) {
                System.out.print("Элемент: " + array[i] +
                        " " + "Индекс: " + (i + 1) + " " + '\n');

                check = true;
            }
        }

        if (check == false) System.out.print("Данный элемент отсутствует в массиве\n");
    }

    void array_sort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Массив отсортирован\n");

        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }

    int rand_array() {
        int[] rand_array = new int[100];

        for (int i = 0; i < 100; i++) {
            rand_array[i] = random.nextInt(100);
        }

        int rand_number = rand_array[random.nextInt(100)];

        return rand_number;
    }
}
