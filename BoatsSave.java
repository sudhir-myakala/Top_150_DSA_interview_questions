import java.util.*;
public class BoatsSave {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int l=sc.nextInt();
        int n=sc.nextInt();
        int [] nums=new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

       int i=0;
       int j=n-1;
       int b=0;
       while(i<=j){
        if(nums[i]+nums[j]<=l){
            i++;
        }
        j--;
        b++;
       }

      
       System.out.println(b);
    }
}
