import java.util.Scanner;

public class Methods {
    Scanner scan = new Scanner(System.in);
    public int array[];
    public int count = 0;

    int rand(int max, int min) {
        max -= min;

        return (int) (Math.random() * max) + min;
    }

    void show_menu() {
        System.out.print( "\n1. Создать массив\n" +
                "2. Узнать количество элементов и информацию о них\n" +
                "3. Сортировка массива\n" +
                "4. Удаление повтораяющихся элементов\n" +
                "5. Выход\n");
    }

    void array_create() {
        count = 0;

        System.out.print("Введите минмальный размер числа: ");
        int left_border = scan.nextInt();

        System.out.print("Введите максимальный размер числа: ");
        int right_border = scan.nextInt();

        System.out.print("Введите размер массива: ");
        int array_size = scan.nextInt();

        array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            array[i] = rand(left_border, right_border);
            count++;
        }

        System.out.print("Массив создан: ");

        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }

    void array_show() {
        System.out.print( "Элементы массива: " );
        for (int i = 0; i < count; i++) System.out.print(array[i] + " ");

        System.out.print( "\nВсего " + count + " элементов\n" );
    }

    void array_sort() {
        System.out.print("1. Пузырьковая сортировка\n" +
                "2. Гномья сортировка\n" +
                "Выбирете алгоритм сортировки: ");

        int choose = scan.nextInt();

        switch (choose) {
            case 1:
                long start = System.currentTimeMillis();

                for (int i = 0; i < count - 1; i++) {
                    for (int j = 0; j < count - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }

                long finish = System.currentTimeMillis();

                System.out.print("Массив отсортирован\n");

                for (int i = 0; i < count; i++) {
                    System.out.print(array[i] + " ");
                }

                System.out.print("\nЭто заняло " + (finish - start) + " милисекунд");
                break;
            case 2:
                int i = 1, tmp;

                long start2 = System.currentTimeMillis();

                while (i < count) {
                    if (i == 0 || array[i - 1] <= array[i]) i++;
                    else {
                        tmp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tmp;
                        i--;
                    }
                }

                long finish2 = System.currentTimeMillis();

                System.out.print("Массив отсортирован\n");

                for (int j = 0; j < count; j++) {
                    System.out.print(array[j] + " ");
                }

                System.out.print("\nЭто заняло " + (finish2 - start2) + " милисекунд");
                break;
        }
    }

    void del_item() {
        int dup_index = 0;
        int[] duplicate_array = new int[count];

        for (int i = 1; i < count ; i++) {
            duplicate_array[0] = array[0];

            if (array[i] != array[i - 1]) {
                duplicate_array[dup_index] = array[i];
                dup_index++;
            }
        }

        count = dup_index;
        array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = duplicate_array[i];
        }
    }
}
