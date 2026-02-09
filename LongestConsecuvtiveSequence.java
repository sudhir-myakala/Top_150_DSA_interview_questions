import java.util.HashMap;
import java.util.Map;

public class LongestConsecuvtiveSequence {
    public static void main(String[] args) {
        int [] arr= new int[]{100,4,101,1,2,3,0};

        // int f=1;
        // for(int i=0;i<arr.length;i++){
        //     int point=arr[i];
        //    int count=1;
        //    boolean foundNext=true;
        //    while(foundNext){
        //     foundNext=false;
        //     for( int j=0;j<arr.length;j++){
        //         if(arr[j]==point+1){
        //         point=point+1;
        //         count++;
        //         foundNext=true;
        //         break;
        //         }
        //     }
        //    }
        //     if(f<count){
        //         f=count;
        //     }

        // }
        //  System.out.println(f);

        // the above code is not optimal code  it is a brute force approach 


        // the below is the code for the optimal solution with time complexity of O(n)

        int longLength=1;
         Map<Integer,Boolean> expMap= new HashMap<>();

        for( int num:arr){
            expMap.put(num,Boolean.FALSE);
        }
        // System.out.println(expMap.keySet()+ " ->" +expMap.values());
        for( int num:arr){
            int cl=1;
            int nn=num+1;
            while(expMap.containsKey(nn) && expMap.get(nn)==false){
                cl++;
                expMap.put(nn,Boolean.TRUE);
                nn++;
            }

            int pn=num-1;
            while(expMap.containsKey(pn) && expMap.get(pn)==false){
                cl++;
                expMap.put(pn,Boolean.TRUE);
                pn--;
            }
            if(cl>longLength){
                longLength=cl;
            }
        }
        System.out.println(longLength);
    }
}


