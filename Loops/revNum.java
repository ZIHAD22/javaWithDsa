package Loops;

public class revNum {
    public static void main(String arr[]) {
        int num = 109;
        int rev = 0;
        int lastDigit;
        while (num > 0) {
            lastDigit = num % 10;
            num = num / 10;
            rev = (rev * 10) + lastDigit;
            System.out.println(rev);
        }
    }
}
