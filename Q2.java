 import java.util.*;
class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int cols = rows;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
