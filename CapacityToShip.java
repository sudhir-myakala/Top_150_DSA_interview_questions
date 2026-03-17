public class CapacityToShip{
    public static void main(String[] args){
      int D=5;
      int [] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
      int minCap=0;
      int maxCap=0;
      for(int i:arr){
         minCap=Math.max(i,minCap);
         maxCap+=i;
      }
    //   System.out.println(minCap+" "+maxCap);

      while(minCap<maxCap){
        int mid=minCap+(maxCap-minCap)/2;

        int days=1;
        int sum=0;

        for(int i:arr){
            if(sum+i>mid){
                days++;
                sum=0;
                
            }
            sum+=i;
        }
        if(days>D){
            minCap=mid+1;
        }
        else{
            maxCap=mid;
        }
        //  System.out.println(minCap);
      }
       System.out.println(minCap);
     
      
      
    }
   
}