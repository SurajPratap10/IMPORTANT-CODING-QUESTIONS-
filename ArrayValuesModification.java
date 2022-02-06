// Changing the values at specific indexes in a given array:


import java.util.Arrays;

public class changevalues {
    public static void main(String[] args) {
        int[] arr = {5,6,7,33,44,23};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int[] nums){
        nums[0] = 101;
        nums[3] = 0;
    }
}


// Output: [101, 6, 7, 0, 44, 23], This is the modified array.
