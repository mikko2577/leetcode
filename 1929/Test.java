public class Test{
	public static void main(String[]args){
		int[]array={1,2,3,4};
		duplicate(array);
	}
	public static int[] duplicate(int[]nums){
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



/*
(input)Given an integer array nums of length n, 
(output)you want to create an array ans of length 2n, 
(how)where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

1.int[]array = {1,2,3}
2.length n = 3
3.length 2n = 3*2=6
4.ans[i] == nums[i] && [i+n] == nums[i]
5.[0,n)

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.
*/