public class BSSThree {
    public static void main(String [] args){
        int [] prices=new int[]{1,2,4};
        int i=1;
        int p=0;
        int buy=prices[0];
        while(i<prices.length){
            if(prices[i]<buy){
                buy=prices[i];
                i++;
            }
            else{
                int cp=prices[i]-buy;
                i=i+2;
                p+=cp;
            }
        }
        System.out.println(p);
        // i am not understanding the solution for this 
    }
}
