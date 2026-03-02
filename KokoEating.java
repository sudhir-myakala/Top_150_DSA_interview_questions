public class KokoEating {
    public static void main(String [] args){
        int [] p=new int[]{30,11,23,4,20};
        int h=5;
        int end=max(p);
        System.out.println(end);
        int start=1;

        while(start<end){
            int mid=start+(end-start)/2;
            // System.out.println(mid);
            if(canEat(p,h,mid)){
                end=mid;
            }
            else{
                start=mid+1;
            }

        }
        System.out.println(start);

    }

    public static boolean canEat(int [] piles,int h,int speed){
        int ho=0;
        for(int p:piles){
        ho+=(int)Math.ceil((double)p/speed);
        System.out.println("the ho value is " +p+" and ho is "+ho+ " speed is "+speed);
        }
        return ho<=h;
    }
    
    public static int  max(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
