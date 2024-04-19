package basicSortingAlgorithms.insertionSort;

public class InsertionSort {
    public static void printArray(int arr[]) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("}");
    }

    public static void inserSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 10, 2, 20, 1, 9, 6, 8, 7, 5, 3, 4, 11 };
        inserSort(marks);

        printArray(marks);

    }
}
