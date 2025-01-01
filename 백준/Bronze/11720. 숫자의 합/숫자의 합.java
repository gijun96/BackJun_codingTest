import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int count = Integer.parseInt(br.readLine());
            String r2 = br.readLine();
            int res = 0;
            for(int i = 0; i< count;i++){
                char r = r2.charAt(i);

                res += Character.getNumericValue(r);

            }
            bw.write(res+"");
            bw.flush();
            bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}