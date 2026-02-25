public class MajorityElement {
    public static void main(String [] args){
        int [] nums=new int[]{2,2,1,1,1,2,2};
        int v=0;
        int m=nums[0];
        for(int i=0;i<nums.length;i++){
            if(v==0){
                v++;
                m=nums[i];
            }
            else if(m==nums[i]){
                v++;
            }
            else{
                v--;
            }
        }
        System.out.println(m); // this element is more repeated
        // the algorithm we used is Boyer–Moore Voting Algorithm
    }
}
