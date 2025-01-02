import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String r1 = br.readLine();
            String r2 = br.readLine();
            String r3 = br.readLine();
            int a = Integer.parseInt(r1);
            int b = Integer.parseInt(r2);
            int c = Integer.parseInt(r3);

            int a1 = (a+b-c);
            int a2 = Integer.parseInt(r1+r2)-c;
            bw.write(a1+"\n");
            bw.write(a2+"");

            bw.flush();
            bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}