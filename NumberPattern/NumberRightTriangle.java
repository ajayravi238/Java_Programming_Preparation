import java.util.Scanner;

public class NumberRightTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

// Input
// 5

// Output
// 1
// 12
// 123
// 1234
// 12345
