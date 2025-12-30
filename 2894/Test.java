public class Test{
	public static void main(String[] args){
		// test1();
		test2();
	}
	public static void test2(){
		int array[] = {2,8,7,3,1,15,27,89};
		for(int i=0; i<array.length; i++){
			// System.out.println(i);
			// System.out.println(array[i]);
			// System.out.println(isEven(i));
			System.out.println("@" + isEven(array[i]));
		}
	}
	public static void test1(){
		isEven(150); 
		System.out.println("? " + isEven(0));
		isEven(121); 
		if(isEven(1000) == true){
			System.out.println("this is an even number");
		}
	}
	public static boolean isEven(int num){
		// System.out.println(7%2);
		// System.out.println(8%2);
		// if(num%2 == 0){
		// 	System.out.println(num + " is an even num");
		// }
		// if(num%2 != 0){
		// 	System.out.println(num + " is an odd num");
		// }
		System.out.println("in side function is even: " + num);
		if(num%2 ==0){
			return true;
		}
		else if(num%2 !=0){
			return false;
		}
		// return false;
		throw new IllegalArgumentException("this line can not be reach.");
		//any invalue condiction could be crush,use for realalistic practice.
	}
}
/*function variable lowcase, class type upcase

computation is more specific: 
double/int = double
int/int = int
String/double = error
String+double = String

caculation more like human

any even number divide by 2 is no remainder at all

options: if + if + 

*/