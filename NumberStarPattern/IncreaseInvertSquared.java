import java.util.Scanner;

public class IncreaseInvertSquared {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = num*num;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(k + " ");
				if(j < num-1) {
					System.out.print("* ");
				}
				k--;
			}
			System.out.println();
		}
	}
}
