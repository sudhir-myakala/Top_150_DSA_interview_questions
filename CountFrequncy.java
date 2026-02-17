import java.util.Arrays;

public class CountFrequncy {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s="aabbccccde";
        int [] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

      int start=0;
      char ch='a';
      while(start<s.length() && ch<='z'){
        if(freq[start]!=0){
            sb.append(freq[start]);
            sb.append(ch);
        }
          start++;
          ch++;
      }

        System.out.println(sb);
    }
}
