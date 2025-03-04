import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		for(int i=d; i<num; i++) {
			if(i == d) {
				System.out.print("{");
			}
			System.out.print(arr[i] + ", ");
		}
		for(int i=0; i<d; i++) {
			if(i == d-1) {
				System.out.print(arr[i] + "}");
			}
			else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
}
