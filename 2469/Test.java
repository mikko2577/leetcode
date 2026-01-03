public class Test{
	public static void main(String[] args){
		// double celsius = 100;
		// String KFC = "200";
		double kelvin = cToK(78);
		// cToK(celsius);
		// cToK("KFC");
		System.out.println(kelvin);
		System.out.println(cToK(0));
		System.out.println(cToF(37));
	}
	public static double cToK(double celsius){
		double kelvin = celsius + 273.15;
		// System.out.println(kelvin);
		return kelvin; //return the result to main
	}
	public static double cToF(double celsius){
		double fahrenheit = celsius * 1.80 + 32.00;
		return fahrenheit;
	}

	


}