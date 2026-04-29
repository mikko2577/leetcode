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
/*{5,6,9,11} 
grouped can be divide by 3 ,m=3
5,11   6,9
num1-num2
(5+11)-(6+9)
*/

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

/*You are given positive integers n and m.

Define two integers as follows:

num1: The sum of all integers in the range [1, n] 
(both inclusive) that are not divisible by m.

num2: The sum of all integers in the range [1, n] (
both inclusive) that are divisible by m.

Return the integer num1 - num2.

*/

