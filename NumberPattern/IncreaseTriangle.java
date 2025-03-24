// Input
// 5
// Output
// 4 
// 4 3 
// 4 3 2 
// 4 3 2 1 
// 4 3 2 1 0 
import java.util.Scanner;

public class IncreaseTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = 1;
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(num-1-j + " ");
				k++;
			}
			System.out.println();
		}
	}
}
