import java.util.Scanner;

public class ObjectArray {
    private static void show_menu() {
        System.out.print("\nВыбирете операцию:" +
                "\n1. Добавить данные о пользователе" +
                "\n2. Показать данные о пользователе" +
                "\n3. Выход\n");
    }

    private static void show_InnerMenu() {
        System.out.print("Выбирете пункт: " +
                "\n1. ID" +
                "\n2. Имя" +
                "\n3. Фамилию" +
                "\n4. Почтовый индекс" +
                "\n5. Номер телефона\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person();
        int choose;

        do{
            show_menu();
            choose = scan.nextInt();

            switch (choose) {
                case 1:
                    int inner_choose;

                    show_InnerMenu();
                    inner_choose = scan.nextInt();
                    scan.nextLine();

                    switch (inner_choose) {
                        case 1:
                            System.out.print("Введите ID: ");

                            int id = scan.nextInt();
                            person.setId(id);
                            break;
                        case 2:
                            System.out.print("Введите имя: ");

                            String first_name = scan.nextLine();
                            person.setFirstName(first_name);
                            break;
                        case 3:
                            System.out.print("Введите фамилию: ");

                            String second_name = scan.nextLine();
                            person.setSecondName(second_name);
                            break;
                        case 4:
                            System.out.print("Введите почтовый индекс: ");

                            String mail_index = scan.nextLine();
                            person.setMailIndex(mail_index);
                            break;
                        case 5:
                            System.out.print("Введите телефонный номер: ");

                            String phone_number = scan.nextLine();
                            person.setPhoneNumber(phone_number);
                            break;
                    }
                    break;
                case 2:
                    show_InnerMenu();
                    System.out.print("6. Показать всю информацию\n");

                    inner_choose = scan.nextInt();

                    switch (inner_choose) {
                        case 1:
                            System.out.print(person.getId() + "\n");
                            break;
                        case 2:
                            System.out.print(person.getFirstName() + "\n");
                            break;
                        case 3:
                            System.out.print(person.getSecondName() + "\n");
                            break;
                        case 4:
                            System.out.print(person.getMailIndex() + "\n");
                            break;
                        case 5:
                            System.out.print(person.getPhoneNumber() + "\n");
                            break;
                        case 6:
                            person.show_info();
                            break;
                    }
                    break;
            }
        }while (choose != 3);

    }
}
