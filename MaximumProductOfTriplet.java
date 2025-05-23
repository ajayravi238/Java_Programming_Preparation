import java.util.*;

public class MaximumProductOfTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		int prod = 1;
		for(int i=0; i<3; i++) {
			prod *= arr[i];
		}
		System.out.println(prod);
	}
}
