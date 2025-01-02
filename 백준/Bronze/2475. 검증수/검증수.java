import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String[] row = br.readLine().split(" ");

            int sum = 0;
            for(int i = 0; i< row.length;i++){
                char r = row[i].charAt(0);
                int a = Character.getNumericValue(r);
                int b = a* a;
                //System.out.println("b ::"+b);
                sum += b;

            }
            bw.write((sum%10)+"");
            bw.flush();
            bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}