import java.util.*;
public class evalRPN {
    public static void main(String[] args){
       String [] v = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
       Stack <String> ss=new Stack<>();
        for(String c:v){

            if(c.equals("+")){
                String b=ss.pop();
                String a=ss.pop();
                System.out.println(a+" "+b);
                ss.push(Integer.toString(Integer.parseInt(a)+Integer.parseInt(b)));
            }
              else if(c.equals("*")){
                String b=ss.pop();
                String a=ss.pop();
                System.out.println(a+" "+b);
                ss.push(Integer.toString(Integer.parseInt(a)*Integer.parseInt(b)));
            }
             else if(c.equals("-")){
                String b=ss.pop();
                String a=ss.pop();
                System.out.println(a+" "+b);
                ss.push(Integer.toString(Integer.parseInt(a)-Integer.parseInt(b)));
            }
             else if(c.equals("/")){
                String b=ss.pop();
                String a=ss.pop();
                System.out.println(a+" "+b);
                ss.push(Integer.toString(Integer.parseInt(a)/Integer.parseInt(b)));
            }
          
            else{
                ss.push(c);
            }
            

        }
        System.out.println(ss.pop());

    }
}
