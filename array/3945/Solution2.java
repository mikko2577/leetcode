public class Solution2{
	public static void main(String args[]){
		int n = 5667889;
		System.out.println(freq(n));
	}

	public static int freq(int n){
		int result = 0;
		int rest = n;

		while(rest > 0){
			int digi = rest % 10;
			result = result + digi;
			rest = rest / 10;
		}
		return result;

	}
}
