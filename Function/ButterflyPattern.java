package Function;

public class ButterflyPattern {
    public static void pattern(int line) {

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= (line - i) * 2; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("   ");
        }
        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= (line - i) * 2; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("   ");
        }
    }

    public static void main(String[] args) {
        pattern(9);
    }
}
