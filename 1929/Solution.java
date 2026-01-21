class Solution {
    public int[] getConcatenation(int[] nums) {
       int n = nums.length; //(input)Given an integer array nums of length n, 
		int size = n*2; //(output)you want to create an array ans of length 2n, 
		int ans[] = new int[size];
		for(int i = 0; i<nums.length; i++){ 
			ans[i] = nums[i];//where ans[i] == nums[i]
		}
		for(int i = 0; i<nums.length;i++){
			ans[n+i] = nums[i];
		}
		for(int i = 0; i < ans.length; i++){
			System.out.println(ans[i]); //initializer 6 0f 0
		}
		return ans; 
    }
}