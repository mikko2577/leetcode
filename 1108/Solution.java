
public class Solution{
	public static void main(String[] args){
		String [] a = {"1.1.1.1"};
		String result = IPaddress2(a);
		System.out.println(result);
	}

	// public static String IPaddress(String[] a){
	// 	String result = "";
	// 	for(int i = 0; i < a.length; i ++){
	// 		result = result + a[i].replace(".","[.]");
	// 	}
	// 	return result;
	// }


	public static String IPaddress2(String []a){
		//create an empty string to store the result
		String result = "";
		//initializer from 0
		String ip = a[0];
		//run all the way from 0 to ip.length()-1
		for(int i = 0; i < ip.length(); i ++){
			//find the '.'
			if(ip.charAt(i) == '.'){
				result = result + "[.]";
			}
			//if not '.', then run the code below
			else{
				result = result + ip.charAt(i);
			}
		}
		return result;
	}
}