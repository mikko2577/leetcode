public class Solution{
	public static void main(String [] args){
		int [] d = {0,1,1,3,4,4,4,5,6};
		int [] a = {1,3,4,5,6};
		System.out.println(digitFreqScore(d,a));

	}

	public static int digitFreqScore(int []d, int []a){
		int result = 0;
		for(int i = 0; i < a.length; i ++){
			int frequency = 0;
			for(int j = 0; j < d.length; j++){
				if(a[i] == d[j]){
					frequency = frequency + 1;
				}
			}
			result += frequency;
			
		}
		return result;
	} 
}