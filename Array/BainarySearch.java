package Array;

public class BainarySearch {
    public static int bainarySearch(int number[], int key) {
        int s = 0;
        int e = number.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            System.out.println(mid);
            if (number[mid] == key) {
                return mid;
            }
            if (key > number[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int findIndex = bainarySearch(marks, 10);
        System.out.println(findIndex);
    }
}
