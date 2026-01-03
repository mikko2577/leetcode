class Solution {
    public int differenceOfSums(int n, int m) {
        int result = 0;
        for(int i = 1; i <= n; i++){
            System.out.println(i);
            if (numCanBeDivideByM(i,m) == false){
                result = result + i;
            }
            else{
                result = result - i;
            }
        }
        return result;
    }

    public boolean numCanBeDivideByM(int num, int m){
		if(num%m == 0){
			return true;
		}
		else{
			return false;
		}     
	}
}

//it can be solve by one line:
class Solution {
    public int differenceOfSums(int n, int m) {
    return IntStream.rangeClosed(1,n).map(i->i%m == 0? -i:i).sum();    
    }
}