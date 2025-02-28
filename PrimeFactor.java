import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=2; i<=num; i++) {
			if(isPrime(i)) {
				int x = num;
				while(x%i == 0) {
					System.out.println(i);
					x/=i;
				}
			}
		}
	}
	public static boolean isPrime(int n) {
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
