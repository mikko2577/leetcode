class Solution {
    public List<Integer> findWordsContaining(String[] array, char letter) {
        int result[] = new int[array.length];
		int resultLocation = 0;
		for(int i =0; i<array.length;i++){
			String words = array[i];
			if(contains(words,letter)){
				result[resultLocation] = i;
				resultLocation++;
			}
		}
	
		// int finalResult[] = new int[resultLocation];
        List<Integer>finalResult = new ArrayList<>();
		for(int i = 0; i< resultLocation; i++){
			finalResult.add(result[i]);
		}
		return finalResult;
    }
    public static boolean contains(String words, char ch){
		boolean result = false;
		for(int i = 0; i<words.length();i++){
			if(words.charAt(i) == ch){
				result = true;
			}
		}
		return result;
	}

    
}