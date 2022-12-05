class Solution {
    public int[] sortArrayByParity(int[] A) {
        
     Integer[] nums = new Integer[A.length];
     for (int i = 0; i < A.length; i++)
        nums[i] = A[i];

     Arrays.sort(nums, (a, b) -> Integer.compare(a % 2, b % 2));

     for (int i = 0; i < A.length; i++)
          A[i] = nums[i];
     return A;
    }
}