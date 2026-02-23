public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int [] nums={2,3,1,2,4,3};
        int target=7;
        int i=0;
        int j=0;
        int minWindow=Integer.MAX_VALUE;
        int cs=nums[0];
        // while(j<nums.length){
        //     if(currentSum>=target){
        //         minWindow=Math.min(minWindow,j-i+1);
        //         currentSum-=nums[i];
        //         i++;
        //     }else{
        //         j++;
        //         if(j<nums.length){
        //             currentSum+=nums[j];
        //         }
        //     }
        // }
        // if(minWindow==Integer.MAX_VALUE){
        //     System.out.println(0);
        // }else{
        //     System.out.println(minWindow);
        // }

     // i am also writing more less time consuming solution below 

     while(j<nums.length){
        cs+=nums[j];
        j++;
        while(cs>=target){
            minWindow=Math.min(minWindow,j-i);
            cs-=nums[i];
            i++;
        }
     }
        if(minWindow==Integer.MAX_VALUE){
            System.out.println(0);
        }else{
            System.out.println(minWindow);
        }
    }


}


// the above is the fast approach ofr the minimum size sub array sum problem and the below is the fast approach  