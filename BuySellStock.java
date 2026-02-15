public class BuySellStock {
    public static void main(String[] args) {
        int [] prices=new int[]{2,4,1};
       int ms=0;
       int buy=prices[0];
      for( int i=1;i<prices.length;i++)
      {
        if(buy>prices[i]){
            buy=prices[i];
        }
        else{
            int cp=prices[i]-buy;
            ms=Math.max(cp,ms);
        }
      }
      System.out.println(ms);

        }
}
// the above problem can also also teh LC- 2016 problem 
