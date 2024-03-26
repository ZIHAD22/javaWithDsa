package Array;

public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i + 1; // user don't know array indexing system that why they start with index 1
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 10, 20, 60, 90, 100, 98 };
        int findIndex = linearSearch(marks, 101);
        if (findIndex != -1) {
            System.out.println("key is found on index = " + findIndex);
        } else {
            System.out.println("key is not found");
        }
    }
}
