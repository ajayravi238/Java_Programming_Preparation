import java.util.Scanner;

public class ReverseFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int first = 0, second = 1;
		arr[0] = first;
		arr[1] = second;
		for(int i=2; i<num; i++) {
			int sum = rev(first) + rev(second);
			arr[i] = sum;
			first = second;
			second = sum;
		}
		for(int i=0; i<num; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int rev(int n) {
		int res = 0;
		while(n != 0) {
			int rem = n%10;
			res = (res*10) + rem;
			n /= 10;
		}
		return res;
	}
}
