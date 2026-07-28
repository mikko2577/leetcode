public class Practice{
	public static void main(String[]args){
		System.out.println(contains("hello",'e')+" = true");
		System.out.println(contains("hello",'a')+" = false");
		System.out.println(contains("hello",'l')+" = true");
		whichHave('e',new String[]{"leet","code"});
		whichHave('a',new String[]{"abc","bcd","aaaa","cbc"});
		int[]array = {3,5,11};
		printArray(array);
	}

//"hello world":String, length:11
//{"hello","world"}:array, lenght:2

	public static boolean contains(String words, char ch){
		boolean result = false;
		for(int i = 0; i<words.length();i++){
			// System.out.println(words.charAt(i));
//print character
			if(words.charAt(i) == ch){
				result = true;
			}
		}
		return result;
	}
	public static int[] whichHave(char letter, String array[]){
//build an array to store the output number
		int result[] = new int[array.length];
//？
		int resultLocation = 0;
		for(int i =0; i<array.length;i++){
//print words
			String words = array[i];
			// System.out.println(words);
//if(words contains letter){
			if(contains(words,letter)){
//？
				result[resultLocation] = i;
				resultLocation++;
				System.out.println(i);
			}
		}
		System.out.print("result: ");
		printArray(result);
		System.out.println("resultLocation = "+ resultLocation);
		System.out.println();
		int finalResult[] = new int[resultLocation];
		for(int i = 0; i< resultLocation; i++){
			finalResult[i]=result[i];
		}
		return finalResult;

	}
	public static void printArray(int[]array){
		System.out.print("{");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+",");
		}
		System.out.print("}");
	}
}
//eng: words contains letter
//java: contains(words,letter)