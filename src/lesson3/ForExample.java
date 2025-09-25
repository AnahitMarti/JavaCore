package lesson3;

public class ForExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a > 8) {
            if (b < 18) {
                System.out.println("barev");
            }
        }
        int l = 10;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
