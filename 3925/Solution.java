public class Solution{
    public static void main(String []args){
        int nums[] = {1,2,3};
        int result[] = reverse(nums);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }
    public static int [] reverse(int [] nums){
        int n = nums.length;
        int []result = new int[n * 2];

        for(int i = 0; i < n; i ++){
            result[i] = nums[i];
        }
        // int current = n;
        for(int i = n-1; i >= 0; i--){ 
        System.out.println("i= " + i);         
            result[n] = nums[i];   
            n++;
        }
        return result;
    }
}
/*
algebra
y=3, x=2, y=5-2(i)
y=4, x=1, y=5-1(i)
y=5, x=0, y=5-0(i)
result[2n-1-i] = nums[i]
*/

