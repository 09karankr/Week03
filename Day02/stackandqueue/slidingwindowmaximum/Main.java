package slidingwindowmaximum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       maxSlidingWindow window = new maxSlidingWindow();
       int[] nums = {1,3,-1,-3,5,3,6,7};
       int k = 3;
        System.out.println(Arrays.toString(window.maximumSlidingWindow(nums,k)));
    }
}
