import java.io.*;
class Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Number of Rows: ");
        int rows = Integer.parseInt(br.readLine());
        int cols = rows;

        for(int i = 1; i<=rows ; i++){
            char ch = 'A';
            for(int j=1; j<=cols; j++){
                System.out.print(j);
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();

        }
    }
}
