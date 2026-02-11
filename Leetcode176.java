import java.util.Arrays;
import java.util.HashMap;

public class Leetcode176 {
    public static void main(String[] args) {
        int[] numbers=new int[]{2,7,9,11};
        int target=9;
        //  for(int i=0;i<numbers.length;i++){
        //     int f=target-numbers[i];
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[j]==f){
        //            System.out.println(i+1);
        //            System.out.println(j+1);
        //         }
        //     }
        // }
        // System.out.println(new int[2]);

        // the above is not a optimal way to solver because it is int O(n^2) 
         HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                System.out.println((map.get(complement) + 1) + " " + (i + 1));
            }

            map.put(numbers[i], i);
        }

        System.out.println(Arrays.toString(new int[2]));

    }
}
