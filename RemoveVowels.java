import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str = s.toLowerCase();
		String res = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && 
					str.charAt(i) != 'o' && str.charAt(i) != 'u') {
				res += str.charAt(i);
			}
		}
		System.out.println(res);
	}
}
