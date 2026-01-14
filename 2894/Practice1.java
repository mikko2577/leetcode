public class Practice1{
	public static void main(String[]args){
		int sumCanBeDivide = sum1(10,4);
		System.out.println(sumCanBeDivide);
		int sumCnNotBeDivide = sum2(10,4);
		System.out.println(sumCnNotBeDivide);
		int finalResult = sumCanBeDivide - sumCnNotBeDivide;
		System.out.println(finalResult);
	}
	public static int sum1(int n, int m){
		int result = 0;
		for(int i =1;i<=n;i++){
			if(i%m ==0){
				System.out.println(i);
				result = result + i;

			}
			// System.out.println(i);
		}
		return result;
	}
	public static int sum2(int n, int m){
		int result = 0;
		for(int i = 1; i <=n;i++){
			if(i%m !=0){
				System.out.println(i);
				result = result +i;
			}
		}
		return result;
	}

}