import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidbaoo";
        int [] f1=new int[26];
        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)-'a']++;
        }
       
       int windowSize=s1.length();
       for(int i=0;i<s2.length();i++){
        int windIdx=0;
        int idx=i;
        int [] f2=new int[26];
        while(windIdx<windowSize && idx<s2.length()){
            f2[s2.charAt(idx)-'a']++;
            idx++;
            windIdx++;
        }
        if(isFreqSame(f1,f2)){
            System.out.println(true);
            return;
        }
       }
       System.out.println(false);

    }
    public static boolean isFreqSame(int f1[],int f2[]){
        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }
}
