import java.util.*;
public class FindAllAnagrams {
    public static void main(String [] args){
       String str = "abab";
        String s="ab";
        int k=s.length();

        List<Integer> l=new ArrayList<>();

        String ans=getFs(s);
        System.out.println(ans);

        for(int i=0;i<=str.length()-k;i++){
            String window=str.substring(i, i+k);
            System.out.println(window +" window for i " +i);
            if(getFs(window).equals(ans)){
                l.add(i);
            }
        }

        System.out.println(l);

        

    }
     public static  String getFs(String str){
        int [] freq=new int[26];

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }

        char c='a';

        StringBuilder fs=new StringBuilder();

        for(int i:freq){
            fs.append(c++);
            fs.append(i);
        }

        return fs.toString(); // helps in converting the String builder into String 
    }

     
       
}
