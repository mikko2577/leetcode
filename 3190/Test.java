public class Test{
	public static void main(String[]args){
		// System.out.println(numOfSteps(2));
		// System.out.println(numOfSteps(8));
		// System.out.println(numOfSteps(15));
		totalSteps();
			
	}
	public static int numOfSteps(int number){
		int step = number % 3;
		// System.out.println(step);
		int buqi = 3 - step;
		if(buqi < step){
			return buqi;
		}
		else{
			return step;
		}
	}
	public static void totalSteps(){
		int [] array = {1,2,3,4};
		int total = 0;
		for(int i = 0; i < array.length;i++){
			// System.out.println(array[i]);
			System.out.println(numOfSteps(array[i]));
			total = total + numOfSteps(array[i]);
		}
		System.out.println(total);
	}

}

/*
print(i): index
print(array[i]):value
print(function(array[i])):map.new value

{beef, pork, banana} A
        |			map
        V            B
{meat, meat, fruit}
*/