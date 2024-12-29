import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){

                String line = bufferedReader.readLine();
                int N = Integer.parseInt(line.split(" ")[0]);
                int M = Integer.parseInt(line.split(" ")[1]);

                int[] arr = new int[N];

                Arrays.fill(arr, 0);
                for(int i = 0; i < M; i++){
                    String b2 = bufferedReader.readLine();
                    int e1 = Integer.parseInt(b2.split(" ")[0]);
                    int e2 = Integer.parseInt(b2.split(" ")[1]);
                    int e3 = Integer.parseInt(b2.split(" ")[2]);
                    for (int j = e1-1; j < e2; j++){
                        arr[j] = e3;
                    }
                }

            for(int r = 0; r < arr.length; r++){
                System.out.print((arr[r])+ " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




}