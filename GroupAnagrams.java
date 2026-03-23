import java.util.*;

public class GroupAnagrams {
    public static void main(String [] args){
        String [] strs=new String[]{"eat","tea","tan","ate","nat","bat"};

       Map<String,List<String>> fsm= new HashMap<>();

       for(String str:strs){
        String st=getFs(str);

        if(fsm.containsKey(st)){
            fsm.get(st).add(str);
        }
        else{
             List <String> strList=new ArrayList<>();
             strList.add(str);
             fsm.put(st,strList);
        }

       }

       System.out.println(fsm.values());

     


    }
      public static  String getFs(String str){
        int [] freq=new int[26];

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }

        char c='a';

        StringBuilder fs=new StringBuilder();

        for(int i:freq){
            fs.append(c);
            fs.append(i);
        }

        return fs.toString(); // helps in converting the String builder into String 
    }

    
    
}
