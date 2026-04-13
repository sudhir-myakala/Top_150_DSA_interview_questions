import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode2273 {
    public static void main(String [] args){
      List<String> words = new ArrayList<>(Arrays.asList("a","b","a"));
         ArrayList<String> fs=new ArrayList<>();
       HashSet<String> m=new HashSet<>();

       for(String str:words){
         String key = getFs(str);
         if(!m.contains(key)){
            m.add(key);
            fs.add(str);
         }
       
       }
      System.out.println(fs);


    }
    private static String getFs(String str){
        int [] freq=new int [26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        char c='a';
        StringBuilder st=new StringBuilder ();

        for(int i:freq){
            st.append(c++);
            st.append(i);
        }

        return st.toString();
    }
}
