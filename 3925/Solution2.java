public class Solution2{
	public static void main(String args[]){
		int [] nums = {1,2,3};
		int [] result = reverse(nums);

		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]);
		}
	}

	public static int [] reverse(int [] nums){
		int n = nums.length;
		int [] result = new int [2*n];
		for(int i = 0; i < n; i ++){
			result [i] = nums [i];
		}
		//the first index of second part: 5 (0,1,2,3,4,5)
		int temp = n;
		//temp = result.length = 6, the last index is 6-1, so n-1
		for(int i = temp-1; i >= 0; i --){
			result[temp] = nums[i];
			temp++;
		}
		return result;
	}
}