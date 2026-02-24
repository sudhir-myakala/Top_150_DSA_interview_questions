import java.util.*;
public class DailyTemperature {
    public static void main(String[] args){
        int [] temp=new int[]{30,60,90};
        int [] res=new int[temp.length];
        int i=0;
        int j=0;
        while(i<temp.length){
            int val=temp[i];
            j=i+1;
            while(j<temp.length){
                if(val<temp[j]){
                    res[i]=j-i;
                    break;
                }
                else{
                    j++;
                }
            }
            i++;
            
        }
        System.out.println(Arrays.toString(res));

        // the above will work only if the length is below <10^5 if it is above it we require the stack
    }
}
