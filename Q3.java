import java.io.*;
class Q3 {
    public static void main(String[] args)throws IOException{
      BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
       System.out.print("Number of Rows: ");
       int rows = Integer.parseInt(br.readLine());
        int cols = rows;

        for(int i=1; i<=rows ; i++){
            for(int j=1; j<=cols; j++){
                System.out.print("1 ");
            }
            System.out.println();
        }
    }

}
