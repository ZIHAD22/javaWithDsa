package Array;

public class FindSmollNumber {
    public static int getsmall(int number[]) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (small > number[i]) {
                small = number[i];
            }
            System.out.println(number[i]);
        }
        return small;
    }

    public static void main(String[] args) {
        int marks[] = { 10, 20, 60, 90, 100, 98, 0 };
        int findSmall = getsmall(marks);
        int length = marks.length;
        System.out.println("length of arry is " + length);
        System.out.println("length of arry is " + (15 / 2));
        System.out.println("Small Number is " + findSmall);
    }
}
