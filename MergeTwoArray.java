import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr1 = new int[num];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[num];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] res = new int[num*2];
		int k = 0;
		for(int i=0; i<arr1.length; i++) {
			res[k++] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			res[k++] = arr2[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
