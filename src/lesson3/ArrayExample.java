package lesson3;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 34, 5, 67, 78};
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            numbers[i] = 8;

        }
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
