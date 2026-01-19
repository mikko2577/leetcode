class Solution {
    public int minimumOperations(int[] nums) {
        int total = 0;
		for(int i = 0; i < nums.length;i++){
			// System.out.println(array[i]);
			// System.out.println(numOfSteps(array[i]));
			total = total + numOfSteps(nums[i]);
		}
        return total;
    }
    public static int numOfSteps(int number){
		int step = number % 3;
		// System.out.println(step);
		int buqi = 3 - step;
		if(buqi < step){
			return buqi;
		}
		else{
			return step;
		}
	}
}