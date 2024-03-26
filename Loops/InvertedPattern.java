package Loops;

public class InvertedPattern {

    public static void main(String arr[]) {
        int line = 4;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line - i + 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}
