import java.util.Scanner;

public class InvertNumberPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num; i>=0; i--) {
        	for(int j=num; j>i; j--) {
        		System.out.print(" ");
        	}
        	for(int j=1; j<i*2; j++) {
        		System.out.print(j);
        	}
        	System.out.println();
        }
	}
}

// Input:
// 5

// Output:
// 123456789
//  1234567
//   12345
//    123
//     1
