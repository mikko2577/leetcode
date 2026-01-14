class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int calValue = calValue(operations);
        return calValue;
    }
    public int calValue(String[]array){
        int x = 0;
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
			if(array[i].equals("++X") || array[i].equals("X++")){ //string use .equals for ==
				x = x + 1;
			}
			else{
				x = x - 1;
			}
			System.out.println(x);
		}
		return x;
    }
}