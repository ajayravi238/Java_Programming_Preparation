import java.util.*;

public class InvertAlternateSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = 1;
		String[] arr = new String[num];
		for (int i = 0; i < num; i++) {
			String str = "";
			for (int j = 0; j < num; j++) {
				if (j == num - 1) {
					str += String.valueOf(k);
				} else {
					str += String.valueOf(k) + "*";
				}
				k++;
			}
			arr[i] = str;
		}
		for (int i = 0; i < num; i = i + 2) {
			System.out.println(arr[i]);
		}
		for (int i = 1; i < num; i = i + 2) {
			System.out.println(arr[i]);
		}
	}
}
