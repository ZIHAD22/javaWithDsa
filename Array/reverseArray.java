package Array;

public class reverseArray {
    public static void revArray(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - (1 + i)];
            arr[arr.length - (1 + i)] = temp;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 10, 20, 60, 90, 100, 98, 0, 900 };
        revArray(marks);
        System.out.print("{ ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ", ");
        }
        System.out.print("}");
    }
}
