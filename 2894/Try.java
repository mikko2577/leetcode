public class Try{
	public static void main(String[] args){
		nCanDM(3,6);
	}
	// public static boolean nCanDM(int n, int m){
	// 	if(n%m == 0){
	// 		return true;
	// 	}
	// 	else{
	// 		return false;
	// 	}
	// }
	
	public static boolean nCanDM(int n, int m){
		int result = 0;
		for(int i = 1; i <= n; i++){
			System.out.println(i);
		}
		if(n%m == 0){
			return true;
		}
		else{
			return false;
		}
	}
}

