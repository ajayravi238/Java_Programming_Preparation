import java.util.*;
public class SortString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        String[] arr = new String[num];
        for(int i=0; i<num; i++) {
        	arr[i] = sc.nextLine();
        }
		for(int i=0; i<arr.length; i++) {
		    for(int j=0; j<arr.length-1; j++) {
		        if(arr[j].charAt(0) > arr[j+1].charAt(0)) {
		            String temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));
	}
}
