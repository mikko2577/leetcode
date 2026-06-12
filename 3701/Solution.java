public class Solution{
	public static void main(String []args){
		int []nums = {1,3,5,7};
		int result = alternatingSum(nums);

		System.out.print(result);
		
	}
	public static int alternatingSum(int [] nums){
		int result = 0;
		for(int i = 0; i < nums.length; i++){
			if(i % 2 == 0      ){
				result = result+ nums[i];
				// System.out.println("+i i:"+i+ " nums[i]:" + nums[i]);
				// System.out.println("+i: result "+result);
				
			}
			else{
				result = result- nums[i];
				// System.out.println("-i i: "+i);
				// System.out.println("-i result: "+result);
				
			}
		}
		return result;
	}
}