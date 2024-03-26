package Variable;

import java.util.Scanner;

public class findAvg {

    public static void main (String arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 3 Number : ");
        int a = sc.nextInt();
        System.out.print("Input 3 Number : ");
        int b = sc.nextInt();
        System.out.print("Input 3 Number : ");
        int c = sc.nextInt();
        int avg = (a + b + c)/2;
        System.out.print("Avg of a b c is : " + avg);
        sc.close();
    }

    
    
}