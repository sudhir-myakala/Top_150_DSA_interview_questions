public class ValidPalindrome {
    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
        String ss=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        System.out.println(ss);
        int i=0;
        int j=ss.length()-1;
        while(i<j){
            if(ss.length()>0 && ss.charAt(i)!=ss.charAt(j)){
                System.out.println(false);
                return;
            }
            i++;
            j--;
        }
        System.out.println("true");
    }
}
