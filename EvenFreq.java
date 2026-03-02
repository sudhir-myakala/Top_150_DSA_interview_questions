public class EvenFreq {
    public static void main(String [] args){
        int [] arr=new int[]{0,1,2,0,0,0,2,4,4,1};
        int v=0;
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(v==0 && arr[i]%2==0){
                v++;
                m=arr[i];
            }
            else if(m==arr[i]){
                v++;
            }
            else if (m!=arr[i] && m %2 ==0 ){
                v--;
            }else{
                continue;
            }
            
        }
        System.out.println(m);
        System.out.println(m != 0 ? m % 2 == 0 ? m : -1 : 0);

        // zero does not work 

    }
}
