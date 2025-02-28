import java.util.Scanner;

public class PrimeWithRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++) {
			if(i==0 || i == 1) {
				System.out.println(i);
			}
			else {
				int flag = 0;
				for(int j=2; j<=i/2; j++) {
					if(i%j == 0) {
						flag = 1;
					}
				}
				if(flag == 0) {
					System.out.println(i);
				}
			}
		}
	}
}
