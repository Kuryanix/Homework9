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

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr [i];
            }
        }
        System.out.println("Минимальнвя сумма трат за день составила " + min + " рублей");

        // Задача 3
        double average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        // Задача 4
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length - 1; j >= 0; j--) {
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
