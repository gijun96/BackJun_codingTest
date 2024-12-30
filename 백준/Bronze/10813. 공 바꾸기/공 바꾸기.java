import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){

                String line = bufferedReader.readLine();
                int N = Integer.parseInt(line.split(" ")[0]);
                int M = Integer.parseInt(line.split(" ")[1]);

                int[] arr = new int[N];
                // 초기값 세팅
                for(int i = 0; i < N; i++){
                    arr[i] = i+1;
                }

                for(int i = 0; i < M; i++){
                    String b2 = bufferedReader.readLine();
                    int e1 = Integer.parseInt(b2.split(" ")[0]);
                    int e2 = Integer.parseInt(b2.split(" ")[1]);

                    int dum = arr[e1-1];
                    arr[e1-1] = arr[e2-1];
                    arr[e2-1] = dum;

          

                }

            String result = String.join(" ",
                    Arrays.stream(arr)
                            .mapToObj(String ::valueOf)
                            .toArray(String[] :: new));

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                bw.write(result.trim());
                bw.flush();
                bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




}