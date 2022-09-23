public class Main {
    public static void main(String[] args) {
        // Задача 1

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей");

        // Задача 2

        int max = 99999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        int min = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr [i];
            }
        }
        System.out.println("Минимальнвя сумма трат за день составила " + min + " рублей");

        // Задача 3
        int days = 30;
        double average = sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        // Задача 4
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = 10; j >= 0; j--) {
            System.out.print(reverseFullName[j]);
        }

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
