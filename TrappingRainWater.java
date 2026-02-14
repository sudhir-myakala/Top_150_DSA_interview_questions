import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int [] height=new int []{0,1,0,2,1,0,1,3,2,1,2,1};
         int [] left=new int [height.length];
        int [] right=new int [height.length];
        left[0]= height[0];;
        right[height.length-1]=height[height.length-1];
        int i=1;
        int j=height.length-2;
        while(i<height.length){
            left[i]=Math.max(left[i-1],height[i]);
            i++;
            right[j]=Math.max(right[j+1],height[j]);
            j--;
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        int water=0;

        int ii=0;
        while(ii<left.length){
            water+=Math.min(left[ii],right[ii])-height[ii];
            System.out.println(left[ii]+" left and right " + right[ii]+ " height "+ height[ii]+ " water "+water);
            ii++;
        }
        System.out.println(water);
    }
}
