public class NumArray {
    private int[] sums;
    private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }

    void update(int i, int val) {
        int diff = val - nums[i];
        nums[i] = val;
        for (int x = i; x < nums.length; x ++) {
            sums[x] += diff;
        }
    }

    public int sumRange(int i, int j) {
        return sums[j] - sums[i] + nums[i];
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */