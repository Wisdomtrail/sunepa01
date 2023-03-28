import java.util.Arrays;

public class Cls {
    public static void main(String[] args) {
        int sum = 0;
        int h = 0;
        int[] arr = {1,2,3,4,5};
        int[] sums = new int[arr.length];
        int indexToRemove = 0;
        while (indexToRemove < arr.length) {
            int[] newArr = new int[arr.length - 1];

            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != indexToRemove) {
                    newArr[j] = arr[i];
                    sum += newArr[j];
                    j++;
                }
            }
            sums[h] = sum;
            h++;
            indexToRemove++;
            sum = 0;
        }

    }
}
