public class Practice{
	public static void main(String[]args){
		test();
		test2();
		test3();
	}
	public static void test(){
		int a = 0;
		for(int i = 0; i < 4; i++){
			a = a + 5;
		}
		System.out.println(a);
		
	}
	public static void test2(){
		int a = 0;
		for(int i = 0; i < 3; i++){
			if(i % 2 == 0){
				a = a + 5;
			}
		}
		System.out.println(a);

	}
	public static void test3(){
		int a = 0;
		for(int i = 0; i < 3; i++){
			if(i % 2 == 0){
				a = a + 5;
			}
			else{
				a = a - 2;
			}
		}
		System.out.println(a);

	}
}