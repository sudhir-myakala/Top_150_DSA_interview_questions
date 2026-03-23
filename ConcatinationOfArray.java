import java.util.*;

public class ConcatinationOfArray {
    public static void main(String [] args){
        int [] nums=new int[]{1,2,1};

        int k=0;


        int [] ans=new int[2*nums.length];
         int j=nums.length;
        for(int i=0;i<nums.length;i++){
            System.out.println("i is "+i+ " k is " +k+ " j is "+j);
            ans[k++]=nums[i];
            ans[j++]=nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
