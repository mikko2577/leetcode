public class Practice{
	public static void main(String[]args){
		// int[]arr = {0,2,1,5,3,4};
		int[]arr = {5,0,1,2,3,4};
		change(arr);
		printArr((arr));
		printArr(change(arr));
	}
	public static int[] change(int[]nums){
		int[]ans = new int[nums.length];
		for(int i = 0; i<nums.length;i++){
			// System.out.println(nums[i]);
			ans[i] = nums[nums[i]];
			//nums[nums[i]]: i=0;nums[0]=5;nums[5]=4
		}
		return ans;
	}
	public static void printArr(int[]arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}