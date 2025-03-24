// Input
// 5
// Output
//     1
//    1 1
//   1   1
//  1     1
// 1       1
//  1     1
//   1   1
//    1 1
//     1
import java.util.Scanner;

public class DiamondHallow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
        	for(int j=i; j<num; j++) {
        		System.out.print(" ");
        	}
        	for(int j=0; j<i; j++) {
        		if(j==0) {
        			System.out.print("1");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}
        	for(int j=1; j<i; j++) {
        		if(j==i-1) {
        			System.out.print("1");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
        
        for(int i=1; i<num; i++) {
        	for(int j=1; j<i; j++) {
        		System.out.print(" ");
        	}
        	for(int j=i-1; j<num; j++) {
        		if(j==i) {
        			System.out.print("1");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}
        	for(int j=i-1; j<num-2; j++) {
        		if(j==num-3) {
        			System.out.print("1");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
	}
}
