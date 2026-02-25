import java.util.*;

public class NumberFreq {
    public static void main(String [] args){
        int [] arr=new int[]{1,2};
        int n=arr.length/3;
        System.out.println(n);
        HashMap<Integer,Integer> map=new HashMap<>();
       

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
            map.put(arr[i],1);
            }
        }

        System.out.println(map.keySet() + " " +map.values());

         ArrayList<Integer> list=new ArrayList<>();

         System.out.println(" inital list "+list);

       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
 
        if(entry.getValue()>n ){
            System.out.println(entry.getKey()+ "  "+entry.getValue() + " " + n );
            list.add(entry.getKey());
            System.out.println("inside loop "+list);
        }
       }
       System.out.println("last form "+list);


        // the apporach use time complexity and space complexity is O(n) and O(n) but for optimal approach of we need to use boyer moore voting algorithm 

    }
}
