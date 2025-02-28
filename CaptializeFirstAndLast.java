import java.util.Scanner;

public class CaptializeFirstAndLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			char fc = arr[i].charAt(0);
			char lc = arr[i].charAt(arr[i].length()-1);
			System.out.print((char)(fc-32));
			System.out.print(arr[i].substring(1, arr[i].length()-1));
			System.out.print((char)(lc-32) + " ");
		}
	}
}
