package Function;

public class zero_one_triangle {
    public static void zero_one_triangles(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zero_one_triangles(5);
    }
}
