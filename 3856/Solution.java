class Solution {
    public String trimTrailingVowels(String s) {
        char[]words = s.toCharArray();//String translate to array
		String result = "";

		boolean findFirstNotVowel = false;
 		for(int i = words.length - 1; i > -1; i--){
			//words.length - 1= 3, i: 3,2,1,0 
			if(isVowels(words[i]) == false){
				findFirstNotVowel = true;
			}
			if(findFirstNotVowel == true){
				result = words[i]+result;
				//a + "" = a, e + a = ea; d+ ea = dea; i + dea = idea
			}	
		}return result;
    }
    public static boolean isVowels(char target){
		char[]vowels = {'a','e','i','o','u'};
		for(int i = 0; i < vowels.length; i++){
			// System.out.println(vowels[i]);
			if(vowels[i] == target){
				return true;
			}
		}
		return false;
	}
}