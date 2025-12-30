public class Test2{
	public static void main(String[] args){
		// System.out.println(divideBy3(51));
		// System.out.println(mCanBeDivideByN(81,11));
		// revision();
		addOrMinus();

	}
	public static boolean divideBy3(int num){
		if(num%3 == 0){
			return true;
		}
		else{
			return false;
		}

	}
	public static boolean mCanBeDivideByN(int m, int n){
		if(m%n == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void revision(){
		int array[] = {1,5,3};
		int sum = 0;
		for(int i = 0; i<array.length; i++){
			sum = sum + array[i];
		}
		System.out.println(sum);
	}
	public static void addOrMinus(){ //if number divide by 3, add it, else minus it.
		int array[] = {3,6,9,10};
		int sum = 0;
		for(int i = 0; i< array.length; i++){
			System.out.println("#" + array[i]);
			if(divideBy3(array[i]) == true){
				System.out.println(array[i]+" in first if");
				sum = sum + array[i];
			}
			if(divideBy3(array[i]) == false){
				System.out.println(array[i]+" in second if");
				sum = sum - array[i];
			}
		}
		System.out.println(sum);
	}
}