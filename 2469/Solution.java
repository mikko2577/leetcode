class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = cToK(celsius);
        double f = cToF(celsius);
        double array[] = {kelvin, f};
        return array;
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