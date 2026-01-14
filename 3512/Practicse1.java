public class Practicse1{
	public static void main(String[]args){
		int [] array = {3,9,7};
		int x = sum(array);
		System.out.println(x);
	}
	public static int sum(int array []){
		int result =0;
		for(int i=0;i<array.length;i++){
			// System.out.println(array[i]);
			result = result + array[i];
		}
		
		// System.out.println(result);
		return result;
	}




}