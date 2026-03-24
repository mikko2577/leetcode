import java.util.Arrays;
// import java.util.Collections;

public class Practice{
	public static void main(String[]args){
		System.out.println(isVowels('u'));
		System.out.println(trim("idea"));
	}
	//"idea"->{'i','d','e','a'}; length = 4
	public static String trim(String s){
		char[]words = s.toCharArray();//String translate to array
		System.out.println(s);
		System.out.println(Arrays.toString(words));
		// words = reverse(words);
		System.out.println(Arrays.toString(words));

		String result = ""; // initializer: int count = 0;
		boolean findFirstNotVowel = false;
 		for(int i = words.length - 1; i > -1; i--){//reverse loop
			//words.length - 1= 3, i: 3,2,1,0 
			if(isVowels(words[i]) == false){
				findFirstNotVowel = true;
			}
			if(findFirstNotVowel == true){
				result = words[i]+result;
				//a + "" = a, e + a = ea; d+ ea = dea; i + dea = idea
			}	
		}return result;
	
	public static boolean isVowels(char target){
		char[]vowels = {'a','e','i','o','u'};
		for(int i = 0; i < vowels.length; i++){
			System.out.println(vowels[i]);
			if(vowels[i] == target){
				return true;
			}
		}
		return false;
	}
	// public static char[] reverse(char[] origin){
	// 	char[]result = new char[origin.length];
	// 	for(int i = 0; i< origin.length; i++){
	// 		result[i] = origin[origin.length-i-1];
	// 		//0 -> 4-0-1=3, 1-> 4-1-1=2, 2->4-2-1=1; 3-> 4-3-1=0
	// 	}
	// 	return result;
	// }
}

/*You are given a string s that consists of lowercase English letters.
Return the string obtained by removing all trailing vowels from s.
The vowels consist of the characters 'a', 'e', 'i', 'o', and 'u'.
trailing = start from tail
*/