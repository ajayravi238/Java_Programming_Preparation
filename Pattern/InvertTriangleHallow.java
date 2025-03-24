import java.util.Scanner;

public class InvertTriangleHallow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<num; j++) {
				if(i == j || i == 0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=i; j<num-1; j++) {
				if(j==num-2 || i==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
