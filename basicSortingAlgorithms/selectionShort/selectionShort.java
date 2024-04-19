package basicSortingAlgorithms.selectionShort;

// import basicSortingAlgorithms.helperFunc.helperFunc;

public class selectionShort {
    public static void printArray(int arr[]) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void inserSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j++) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }

    public static void selection_short(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // System.out.println(selected);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    public static void main(String[] args) {
        // helperFunc hf = new helperFunc();
        int marks[] = { 10, 2, 20, 1, 9, 6, 8, 7, 5, 3, 4, 11 };
        int marks2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20, };
        // selection_short(marks);
        // hf.printArray(marks2);
        // hf.hello();
        inserSort(marks);
        printArray(marks);

    }
}
