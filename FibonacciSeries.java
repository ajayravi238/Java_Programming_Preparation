import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int first = 0, second = 1;
		System.out.print(first + " " + second + " ");
		int fib = 0;
		for(int i=2; i<num; i++) {
			fib = first + second;
			System.out.print(fib + " ");
			first = second;
			second = fib;
		}
	}
}
