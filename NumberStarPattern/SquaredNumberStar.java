import java.util.Scanner;

public class SquaredNumberStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = 1;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(j == num-1) {
					System.out.print(k);
				}
				else {
					System.out.print(k + "*");
				}
				k++;
			}
			System.out.println();
		}
	}
}
