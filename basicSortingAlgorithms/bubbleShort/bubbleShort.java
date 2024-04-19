package basicSortingAlgorithms.bubbleShort;

public class bubbleShort {
    public static void bubble_short(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("already shorted");
                break;
            }
        }
    }

    public static void printArray(int arr[]) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        int marks[] = { 10, 2, 20, 1, 9, 6, 8, 7, 5, 3, 4, 11 };
        int marks2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20, };
        bubble_short(marks2);
        printArray(marks);
    }
}
