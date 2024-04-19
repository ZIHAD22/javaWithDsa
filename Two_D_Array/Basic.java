package Two_D_Array;

import java.util.Scanner;

public class Basic {
    public static boolean search(int matirx[][], int key) {
        for (int i = 0; i < matirx.length; i++) {
            for (int j = 0; j < matirx[0].length; j++) {
                if (matirx[i][j] == key) {
                    System.out.println("key found (" + i + " " + j + ")");
                    return true;
                }
            }
        }

        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll[][] = new int[3][3];

        for (int i = 0; i < roll.length; i++) {
            for (int j = 0; j < roll[0].length; j++) {
                roll[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array");
        for (int i = 0; i < roll.length; i++) {
            for (int j = 0; j < roll[0].length; j++) {
                System.out.print(roll[i][j] + " ");
            }
            System.out.println();
        }

        search(roll, 9);
    }
}
