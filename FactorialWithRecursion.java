// Factorial with recursion

public class RecursionFactorial
{
	public static void main(String[] args) {
		int num = 5;
		System.out.println(fact(num));
	}
	public static int fact(int n) {
	    if(n == 0 || n == 1) {
	        return 1;
	    }
	    return n * fact(n-1);
	}
}
