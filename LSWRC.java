import java.util.HashSet;
import java.util.Set;

public class LSWRC {
    public static void main(String[] args) {
        String s="pwwkexpwe";
         int maxLength=0;
        int left=0;
        Set <Character> charset=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(charset.contains(s.charAt(right))){
                charset.remove(s.charAt(left));
                left++;
            }
            charset.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        System.out.println(maxLength);
    }

}
