import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 0, max = 0;

        System.out.print("Enter size: ");
        int size = scan.nextInt();

        int[] array = new int[size];

        System.out.print("Enter items: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        int[] pocket_array = new int[size];

        for (int i = 0; i < size - 1; i++) {
            for (int j = size; j > 0; j--) {
                if (array[j] > array[j + 1]) min = array[j + 1];
                else min = array[j];
            }

            pocket_array[i] = min;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(pocket_array[i] + " ");
        }
    }
}
