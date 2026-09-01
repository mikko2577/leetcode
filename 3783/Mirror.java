public class Mirror{
	public static void main(String args[]){
		int n = 111;
		System.out.println(mirror2(n));
	}

	// public static int mirror(int n){
	// 	int result = 0;
	// 	int reverse = 0;
	// 	if(n >= 10){
    //         int digit = n % 10;
    //         reverse = digit * 10 + (n / 10);
    //         result = Math.abs(n - reverse);
   	// 	 }
   	// 	else{
    //         	return 0;
    //     }
	// 	return result;
	// }

	public static int mirror2(int n){
		int num = n;
		int reverse = 0;
		while(n != 0){
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		
		int result = Math.abs(num - reverse);
		return result;
	}
}