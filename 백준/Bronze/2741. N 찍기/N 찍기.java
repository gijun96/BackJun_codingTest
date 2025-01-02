import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String row = br.readLine();
            int count = Integer.parseInt(row);

            for(int i = 1; i<= count;i++){
                bw.write(i+"\n");
            }

            bw.flush();
            bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}