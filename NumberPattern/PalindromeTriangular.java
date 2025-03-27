// Input: 
// 5
// Output:
//     1
//    212
//   32123
//  4321234
// 543212345

import java.util.Scanner;

public class PalindromeTriangular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=i; j<num; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
