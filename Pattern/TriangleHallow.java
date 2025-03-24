import java.util.Scanner;

public class TriangleHallow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=i; j<num-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				if(j==0 || i==num-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0; j<i; j++) {
				if(j==i-1 || i==num-1) {
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
