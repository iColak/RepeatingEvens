package arrays;

public class RepeatingEvens {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 2, 7, 4, 8, 9, 3, 4, 8, 2, 1, 6, 9, 8};
        int[] duplicate = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    if (!isFind(duplicate, arr[i]) && arr[i] % 2 == 0) {
                        duplicate[index++] = arr[i];
                    }
                    break;
                }
            }
        }
        for (int i : duplicate) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
