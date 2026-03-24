public class Try{
	public static void main(String[]args){
		char target = 'i';
		printVowels(target);
	}

	public static boolean printVowels(char target ){
		char[]vowels = {'a','e','i','o','u'};
		for(int i = 0; i < vowels.length; i++){
			System.out.print(vowels[i]);
			System.out.print(" ");
			if(vowels[i] == target){
				return true;
			}
		}
		return false;
	}

	// public static boolean vowelsInside(){

	// }

}