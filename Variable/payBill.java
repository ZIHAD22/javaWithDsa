package Variable;

import java.util.Scanner;

public class payBill {
    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The Price : ");
        float pen = sc.nextFloat();
        System.out.print("Please Enter The Price : ");
        float pencel = sc.nextFloat();
        System.out.print("Please Enter The Price : ");
        float eraser = sc.nextFloat();
        sc.close();
        float total = pen + pencel + eraser;
        total = total + (total * (18 / 100f));
        System.out.println("Here is your bill (18% gst tax) : " + total);
    }
}
