import java.util.*;
public class OccurenceOfCharacter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[256];
		for(int i=0; i<str.length(); i++) {
		    arr[(int)str.charAt(i)]++;
		}
		for(int i=0; i<256; i++) {
		    if(arr[i]!=0) {
		        System.out.println((char)i + "-" + arr[i]);
		    }
		}
	}
}
