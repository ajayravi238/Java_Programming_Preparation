import java.util.Scanner;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		int k = 0;
		int[] res = new int[num];
		for(int i=0; i<num; i++) {
			if(arr[i] != 0) {
				res[k++] = arr[i];	
			}
		}
		for(int i=0; i<num; i++) {
			if(arr[i] == 0) {
				res[k++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
