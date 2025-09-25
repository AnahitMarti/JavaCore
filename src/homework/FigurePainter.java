package homework;

public class FigurePainter {
    public static void main(String[] args) {
//Figure 1
        int a = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = i; j >= 0; j--) {
                System.out.print("* ");


            }


        }

        System.out.println();
        System.out.println();

        //Figure 2
        int i = 0;
        for (int j = 0; j < 5; j++) {
            System.out.println();
            for (int k = j; k <= 4; k++) {

                System.out.print("* ");

            }

        }

        System.out.println();
        System.out.println();


        //Figure 3

        int b = 0;
        for (int j = 4; j >= 0; j--) {
            System.out.println();
            for (int v = j; v >= 0; v--) {
                System.out.print("  ");

            }

            for (int k = j; k <= 4; k++) {
                System.out.print("* ");

            }


        }
        System.out.println();
        System.out.println();

        //Figure 4

        int n = 5;
        for (int j = 0; j < n; j++) {

            for (int k = 0; k < j; k++) {
                System.out.print("  ");

            }
            for (int k = n; k > j; k--) {
                System.out.print("* ");

            }

            System.out.println();
        }
        System.out.println();
        System.out.println();


        //figure 5


        for (int j = 0; j < 5; j++) {
            for (int k = 4; k > j; k--) {
                System.out.print(" ");

            }
            for (int k = 0; k <= j; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }


        for (int j = 0; j < 4; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(" ");

            }
            for (int k = 4; k > j; k--) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}











