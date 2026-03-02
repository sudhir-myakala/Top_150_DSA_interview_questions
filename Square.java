public class Square{
    public static void main(String[] args){
        int x=33;
        int i=2;
        int e=x;
        int res=0;
        while(i<=e){
            int mid=i+(e-i)/2;
            if(mid*mid<x){
                  res=mid;
                i=mid+1;
            }
            else if(mid*mid>x){
                e=mid-1;
               
            }
            else{
                System.out.println(mid);
                return;
            }
            // i++;
           
        }
        System.out.println(res);
    }
}