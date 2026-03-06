class Solution {
    public int[] buildArray(int[] nums) {
        int[]ans = new int[nums.length];
		for(int i = 0; i<nums.length;i++){
			// System.out.println(nums[i]);
			ans[i] = nums[nums[i]];
			//nums[nums[i]]: i=0;nums[0]=5;nums[5]=4
		}
		return ans;
    }
}