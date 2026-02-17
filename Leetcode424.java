public class Leetcode424 {
    public static void main(String[] args) {
        String s="AABABBA";
        int [] freq=new int[26];
        int left=0;
        int maxWindow=0;
        int maxFreq=0;
        int k=1;
        for( int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);
            int windowLength=right-left+1;
            if(windowLength-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowLength=right-left+1;
            maxWindow=Math.max(windowLength,maxWindow);
        }
        System.out.println(maxWindow);
    }
}

// this is the optimal solution for the problem 