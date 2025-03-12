import java.util.Scanner;

public class NumberInvertRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i=num; i>0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// Input:
// 5

// Output:
// 12345
// 1234
// 123
// 12
// 1
