package Function;

public class Piramid {
    public static void printPremid(int line) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String arr[]) {
        printPremid(10);
    }
}
