import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] num2 = new int[] { 2, 5, 6 };
        int[] num3 = new int[num1.length];
        int i = 0, j = 0, k = 0, m = 3;
        while (i < m && j < num2.length) {
            if (num1[i] <= num2[j]) {
                num3[k++] = num1[i++];
            } else {
                num3[k++] = num2[j++];
            }
        }
        while (i < m) {
            num3[k++] = num1[i++];
        }
       while (j < num2.length) {
            num3[k++] = num2[j++];
        }

        System.out.println(Arrays.toString(num3));
    }
}