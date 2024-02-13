package Basics;

import java.util.Arrays;

public class TwoSum {
    public static void main(String args[]){
        int[] nums = new int[10];
        for(int i=0;i<nums.length;i++){
            nums[i]=(int) (Math.random()*10);
        }
        Arrays.sort(nums);
        System.out.println("The given array is: "+Arrays.toString((nums)));

        int target = 12;
        //int target = (int) (Math.random()*80)+50;
        System.out.println("Taregt value is: "+target);
        TwoSumTest tst = new TwoSumTest();
        System.out.println("Sum found by joining values at these indexes: "+Arrays.toString(tst.twoSum(nums,target)));
    }
}

class TwoSumTest{
    public int[] twoSum(int[] nums, int target){
       try{
           for(int i=0;i<nums.length;i++){
               for(int j=i+1;j<nums.length;j++){
                   if (nums[j]+nums[i]==target){
                       return new int[]{i,j};
                   }
               }
           }
       } catch(IllegalArgumentException e) {
           System.err.println("No solution");

       }

        return nums;
    }
}