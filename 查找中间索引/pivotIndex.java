package top.punkginger.test;

public class pivotIndex {
    public int pivotIndex(int[] nums) {
        int L = nums.length;
        int sumFor = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if(sum-nums[0]==0){
            return 0;
        }
        for (int j = 0; j < L; j++) {
            sumFor += nums[j];
            while (sumFor-nums[j] == sum - sumFor) {
                return j;
            }
        }
        return -1;
    }
}

