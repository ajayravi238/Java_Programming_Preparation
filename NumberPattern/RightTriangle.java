// Input
// 5
// Output
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = 1;
        for(int i=0; i<num; i++) {
        	for(int j=0; j<=i; j++) {
        		System.out.print(k + " ");
        		k++;
        	}
        	System.out.println();
        }
	}
}
