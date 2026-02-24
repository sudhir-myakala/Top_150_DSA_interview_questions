import java.util.*;
public class IsValid {
    public static void main(String [] args){
       String s = "{(){}[{}]}";
       Stack <Character> ss=new Stack<>();

       for(char c:s.toCharArray()){
        if(c=='(' || c=='[' || c=='{'){
            ss.push(c);
        }
        else{
            if(ss.isEmpty()){
                System.out.println(false);
                return; 
            }
            char cc=ss.pop();

            if(c==')' && cc !='(') {
                System.out.println(false);
                return;
            }
             if(c=='}' && cc !='{') {
                System.out.println(false);
                return;
            }
             if(c==']' && cc !='[') {
                System.out.println(false);
                return;
            }
        }
       }
       System.out.println(ss.isEmpty());

    }
}
