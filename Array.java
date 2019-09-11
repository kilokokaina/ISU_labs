import java.util.Scanner;

class Array_Create {
    Scanner scan = new Scanner(System.in);
    public int[] array;
    public int count = 0;

    void show_menu() {
        System.out.print("\n1. Создать массив\n" +
                "2. Узнать количество элементов и информацию о них\n" +
                "3. Добавить элемент\n" +
                "4. Удалить элемент\n" +
                "5. Узнать элемент по индексу\n" +
                "6. Сделать вставку по индексу\n" +
                "7. Выход\n");
    }

    void array_create(int func_size) {
        array = new int[func_size];

        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < func_size; i++) {
            array[i] = scan.nextInt();
            count++;
        }
    }

    void array_show() {
        System.out.print("Элементы массива: ");
        for(int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nВсего " + count + " элементов\n");
    }

    void get_item() {
        System.out.print("Введите индекс элемента: ");

        int index_num = scan.nextInt();

        for(int i = 1; i <= count; i++) {
            if (i  == index_num) System.out.print("Это элемент " + array[i - 1] + '\n');
        }
    }

    void add_item() {
        System.out.print("Введите элемент, который хотите добавить: ");

        int added_item = scan.nextInt();
        int[] new_array = new int[count + 1];

        for(int i = 0; i < count; i++) {
            new_array[i] = array[i];
        }

        for(int i = count; i <= (count + 1); i++) {
            if (i == count + 1) {
                new_array[i] = added_item;
            }
        }
    }
}

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int main_size, choose;

        Array_Create main_array = new Array_Create();

        do {
            main_array.show_menu();
            choose = scan.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Введите размер массива: ");
                    main_size = scan.nextInt();

                    main_array.array_create(main_size);
                    break;
                case 2:
                    main_array.array_show();
                    break;
                case 3:
                    main_array.add_item();
                    break;
                case 5:
                    main_array.get_item();
                    break;
                case 7:
                    break;
            }
        }while (choose != 7);
    }
}