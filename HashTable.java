import java.util.ArrayList;
import java.util.Scanner;

public class HashTable {
    public static void main(String[] args) {
        ArrayList<PairList<String, Long>> pairLists = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int choose;

        for (int i = 0; i < 1024; i++) {
            pairLists.add(i, null);
        }

        do{
            System.out.print("1.Add.\n2.Show.\n3.Search\n4.Delete\n5.Exit\n");
            System.out.print("Enter choose: ");

            choose = scan.nextInt();
            scan.nextLine();

            switch (choose) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scan.nextLine();

                    int position = HashLink.hashKey(name);
                    System.out.print("pos: " + position + "\n");
                    PairList<String, Long> person = new PairList<>(name, HashLink.hash);

                    if (pairLists.get(position) == null) pairLists.set(position, person);
                    else {
                        for (int j = position; j < 10; j++) {
                            if (pairLists.get(j) == null) {
                                pairLists.set(j, person);
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 1024; i++) {
                        if (pairLists.get(i) != null) System.out.print(pairLists.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Enter name for search: ");
                    name = scan.nextLine();
                    System.out.print(pairLists.get(HashLink.hashKey(name)) + "\n");
                    break;
                case 4:
                    System.out.print("Enter name for search: ");
                    name = scan.nextLine();

                    if (pairLists.get(HashLink.hashKey(name)) != null) {
                        pairLists.set(HashLink.hashKey(name), null);
                        System.out.print(name + " deleted\n");
                    }
                    else System.out.print("Error: name not found\n");
                    break;
                default:
                    System.out.print("Error: unexpected input\n");
                    break;
            }
        }while (choose != 5);
    }
}