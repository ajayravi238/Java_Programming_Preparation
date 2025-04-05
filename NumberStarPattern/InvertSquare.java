mport java.util.*;

public class InvertSquare {

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
		for (int i = num-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
