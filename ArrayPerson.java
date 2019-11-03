import java.util.Arrays;
import java.util.Scanner;

public class ArrayPerson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scan.nextInt();

        Person[] pers_array = new Person[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter user`s ID: ");
            int pers_id = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter user`s name: ");
            String pers_name = scan.nextLine();

            pers_array[i] = new Person();

            pers_array[i].setId(pers_id);
            pers_array[i].setFirstName(pers_name);
        }

        for (Person person : pers_array) System.out.print(person.getFirstName() + " " + person.hashCode() + "\n");

        Arrays.sort(pers_array);
        System.out.print("\nArray`s sorting: \n");
        for (Person person : pers_array) System.out.print(person.getFirstName() + " " + person.hashCode() + "\n");

        for (int i = 0; i < size - 1; i++) {
            if (pers_array[i].getId() > pers_array[i + 1].getId()) {
                Person temp = pers_array[i];
                pers_array[i] = pers_array[i + 1];
                pers_array[i + 1] = temp;
            }
        }

        System.out.print("\nArray sorted.\n");
        for (Person person : pers_array) System.out.print(person.getFirstName() + " " + person.hashCode() + "\n");
    }
}