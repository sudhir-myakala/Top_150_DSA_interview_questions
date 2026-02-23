public class BuySellStockTwo {
    public static void main(String [] args){
        int [] prices=new int[]{7,1,5,3,6,4};
  
            int buy=prices[0];
            int p=0;
            int i=0,j=1;
            while(j<prices.length){
                if(prices[j]-prices[i]>0){
                    p+=prices[j]-prices[i];
                }
                i++;
                j++;

            }
        
        System.out.println(p);
        
    }
}
