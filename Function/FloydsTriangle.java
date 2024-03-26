package Function;

public class FloydsTriangle {
    public static void Triangle(int line) {
        int num = 1;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + num++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangle(5);
    }
}
