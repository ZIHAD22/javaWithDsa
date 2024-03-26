package Variable;

import java.util.Scanner;

public class calAreaSqr {
    public static void main (String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Side of A Square : ");
        int side = sc.nextInt();
        int areaOfSqr = side*side;
        System.out.println("The Area of Square is : " + areaOfSqr);
        sc.close();
    }
}
