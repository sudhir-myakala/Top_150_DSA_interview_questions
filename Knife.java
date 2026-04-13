import java.util.*;
public class Knife{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
       
      System.out.println(Josephus(n,k));
    }
    private static int  Josephus(int n,int k ){
          int result=0;

        for(int i=2;i<=n;i++){
            result=(result+k)%i;

        }
        return result+1;
    }
}