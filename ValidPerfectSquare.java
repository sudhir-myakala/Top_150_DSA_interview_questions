public class ValidPerfectSquare {
    public static void main(String[] args) {
        int x = 2147483647;
        int i = 1;
        int e = x;
      while(i<=e){
            int mid=i+(e-i)/2;
            long square=(long)mid*mid;
            if(square<x){
                
                i=mid+1;
            }
            else if(square>x){
                e=mid-1;
               
            }
            else{
                System.out.println(true);
                return;
            }
          
           
        }
        System.out.println(false);
    }
}
