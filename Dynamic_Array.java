import java.util.Scanner;

public class Dynamic_Array extends Array_Create{
    Scanner scan = new Scanner(System.in);

    void get_array() {
        System.out.print(getArray());
    }

    void check_in_mass() {
        boolean check = false;

        do {
            System.out.print("Введите элемент для поиска: ");
            int search_item = scan.nextInt();

            for (int item : getArray()) {
                if(item == search_item) System.out.print("Элемент: " + item + " ");
                check = true;
            }
        }while(check != true);

    }
}
