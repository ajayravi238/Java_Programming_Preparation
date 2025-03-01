import java.util.Scanner;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		int rem = 0, sum = 0;
		while(num != 0) {
			rem = num%10;
			sum += rem;
			num = num/10;
		}
		System.out.println(sum);
	}
}
