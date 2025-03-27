// Input:
// 5
// Output:
// 1 2 3 4 5 
// 10 9 8 7 6 
// 11 12 13 14 15 
// 20 19 18 17 16 
// 21 22 23 24 25 

import java.util.Scanner;

public class ZigZagSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 1;
		int[][] arr = new int[num][num];
		for(int i=0; i<num; i++) {
			if(i%2!=0) {
				for(int j=num-1; j>=0; j--) {
					arr[i][j] = count;
					count++;
				}
			}
			else {
				for(int j=0; j<num; j++) {
					arr[i][j] = count;
					count++;
				}
			}
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
