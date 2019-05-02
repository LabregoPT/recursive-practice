package ui;

public class RecursiveFunctions {
	
	public static long factorial(long i) {
		long result = 0;
		if(i == 0 || i==1) {
			result = 1;
		}else {
			result = i*factorial(i-1);
		}
		return result;
	}
	
	public static long fibonacci(long i) {
		long result = 0;
		if(i == 0 || i==1) {
			result = i;
		}else {
			result = fibonacci(i-1)+fibonacci(i-2);
		}
		return result;
	}
	
	public static long arraySummatory(long[] a, int currentPos) {
		long result = 0;
		if(currentPos == 0) {
			result = a[0];
		}else {
			int newPos = currentPos--;
			result = a[currentPos] + arraySummatory(a, newPos);
		}
		return result;
	}
}
