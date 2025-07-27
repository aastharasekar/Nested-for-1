import java.util.*;
class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Rows: ");
        int rows = sc.nextInt();
        int cols = rows;

        int num = 1;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    
}
