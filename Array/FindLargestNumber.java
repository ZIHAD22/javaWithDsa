package Array;

public class FindLargestNumber {
    public static int findLargestNumber(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int marks[] = { 10, 20, 60, 90, 100, 98, 101 };
        int maxNumber = findLargestNumber(marks);
        System.out.println("Largest Number is " + maxNumber);
    }
}
