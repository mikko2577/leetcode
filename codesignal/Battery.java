import java.util.Arrays;

public class Battery{
	public static void main(String[]args){
		test();
	}
	public static void test(){
		int capacity[] = {2,5,6};//battery every sec -1,
		int originalCapacity[] = Arrays.copyOf(capacity,capacity.length);//record original battery
		int recharge[] = {12,1,4};
		int t = 16;
		for(int i = 0; i < t; i++){

		}
		int time = 0;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;
		discharge(capacity, recharge);
		recharge(capacity, recharge, originalCapacity, time);
		time++;

	}
	public static void discharge(int capacity[], int recharge[]){
		System.out.println(Arrays.toString(capacity));
		for(int i = 0; i < capacity.length;i++){
			if(capacity[i] != 0){
				capacity[i] = capacity[i] - 1;
				break;
			}
			// else{
			// 	capacity[i] = -1;
			// }
		}
	}
	public static void recharge(int capacity[], int recharge[], int original[], int time){//trace the time
		for(int i = 0; i < capacity.length; i++){
			if(capacity[i] == 0 && time%recharge[i] == 1){
				capacity[i] = original[i];
			}
		}
	}
}

