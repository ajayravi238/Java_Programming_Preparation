import java.util.Scanner;

public class PrimeNumWithRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int first = sc.nextInt();
	    int last = sc.nextInt();
	    for(int i=first; i<=last; i++) {
	    	if(i==0 || i==1) {
	    		System.out.println(i + " not a prime");
	    	}
	    	else {
	    		int flag = 0;
		    	for(int j=2; j<i; j++) {
		    		if(i%j==0) {
		    			System.out.println(i + " not a prime");
		    			flag = 1;
		    			break;
		    		}
		    	}
		    	if(flag == 0) {
			    	System.out.println(i + " prime");
			    }
	    	}
	    }
	}
}
