import java.util.*;
class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Rows: ");
        int rows = sc.nextInt();
        int cols = rows;

        for(int i = 1; i <=rows; i++) {
            for(int j = 1; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
