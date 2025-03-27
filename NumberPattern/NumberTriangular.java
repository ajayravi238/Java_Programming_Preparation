// Input:
// 5
// Output:
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5

import java.util.Scanner;

public class NumberTriangular {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=i; j<num; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
