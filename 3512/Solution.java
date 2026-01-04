class Solution {
    public int minOperations(int[] nums, int k){
        int total = sum(nums);
        int remainder = total % k;
        System.out.println(remainder);
        return remainder;
    }
    public static int sum(int array[]){
        int total = 0;
        for(int i = 0; i < array.length; i++){
            total = total + array[i];
        }
        System.out.println(total);
        return total;
    }
}