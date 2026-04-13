
import java.util.*;

public class Main {

    public static char[] reverseString(char[] s ){
        
        int i=0;
        int j=s.length-1;

        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }

        return s;
       
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        char[] s=new char[n];

        for(int i=0;i<s.length;i++){
            s[i]=sc.next().charAt(0);
        }

        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }

        char[] res=reverseString(s);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
      
    }
}
