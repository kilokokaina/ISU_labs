import java.util.Scanner;

public class ArrayTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int size = scan.nextInt();
    int[] array = new int[size];
    int[] pocket_array = new int[size];
    int new_size = size + 1;

    for(int i = 0; i < size; i++) {
      array[i] = scan.nextInt();
    }

    for(int i = 0; i < size; i++) {
      pocket_array[i] = array[i];
    }

    for(int i = 0; i < size; i++) {
      System.out.print(array[i] + " ");
      System.out.print(pocket_array[i] + " ");
    }

    array = new int[new_size];

    System.out.print('\n');

    for(int i = 0; i < size; i++) {
      array[i] = pocket_array[i];
      System.out.print(array[i] + " ");
    }

    System.out.print("\n" + array.length + "\n");

    for(int i = 0; i < new_size; i++) {
      if (i == new_size - 1) {
        array[i] = scan.nextInt();
      }
    }

    for(int i = 0; i < new_size; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
