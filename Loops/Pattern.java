package Loops;

public class Pattern {
    public static void main(String arr[]) {
        int line = 4;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
