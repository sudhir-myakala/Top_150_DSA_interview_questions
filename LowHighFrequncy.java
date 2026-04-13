import java.util.*;
public class LowHighFrequncy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String [] parts=input.split(" ");

        int [] arr=new int [parts.length];

        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
           
        }

        System.out.println(map);

        int min=1;
        int less=0;
        int max=1;
        int high=0;
        for(int k:map.keySet()){
            if(min==map.get(k)){
                less=k;
            }
             if(max<map.get(k)){
                high=k;
            }
        }

        System.out.println(less+" "+high);
        
    }
}
