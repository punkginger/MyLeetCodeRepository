package top.punkginger.test;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int L = nums.length;
        int low=0;
        int high=L-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (nums[mid] < target) {
                low = mid + 1;
            }else if (nums[mid]>target){
                high = mid -1;
            }else return mid;
        }
        return low;
    }
}