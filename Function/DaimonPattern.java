package Function;

public class DaimonPattern {
    public static void daimonPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        daimonPattern(4);
    }
}