public class SubArraySum {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1 };
        int k = 2;
        int c = 0;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            System.out.println("i "+i+ " j "+j);
            if (su(arr, i, j, k)) {
                System.out.println(su(arr,i,j,k));
                c++;
            }
        }

        System.out.println(c);
    }

    public static boolean su(int[] arr, int start, int end, int k) {
        System.out.println("i inside function "+start+" j inside "+end);
        int res = 0;
        for (int i = start; i <= end; i++) {
            res += arr[i];
        }
        return res == k ? true : false;
    }
}
