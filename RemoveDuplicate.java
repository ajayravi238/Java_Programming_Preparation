import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[num];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next();
        }
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        for(String s : arr) {
            lhs.add(s);
        }
        String[] strArr = lhs.toArray(new String[0]);
        for(int i=0; i<strArr.length-1; i++) {
            System.out.print(strArr[i] + " ");
        }
        System.out.print(strArr[strArr.length-1]);
    }
}
