import java.util.Scanner;

public class ReverseArrayInGroup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		for(int i=0; i<num; i=i+k) {
			for(int j=i+k-1; j>=i; j--) {
				if(j>=num) {
					j=num-1;
				}
				System.out.print(arr[j] + " ");
			}
		}
	}
}
