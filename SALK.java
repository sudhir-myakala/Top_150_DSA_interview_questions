import java.util.*;
public class SALK{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        int k=3;

        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[j];
        //         if(sum==k){
        //             c++;
        //         }
        //     }
        // }

        //the above is the  o(n^2) approach
        // below is the better approach 

        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,1);
        int ps=0;


        for(int num:arr){
            ps+=num;
            if(map.containsKey(ps-k)){
                c+=map.get(ps-k);
            }
            map.put(ps,map.getOrDefault(ps, 0)+1);
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(c);
    }
}