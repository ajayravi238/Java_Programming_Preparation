import java.util.Scanner;

public class MaxConsecutiveOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i<num; i++) {
			int count = 0;
			for(int j=0; j<num-1; j++) {
				if(arr[j] == arr[j+1]) {
					count++;
				}
				else {
					count = 0;
				}
				if((count+1) > max) {
					max = count+1;
				}
			}
		}
		System.out.println(max);
	}
}
