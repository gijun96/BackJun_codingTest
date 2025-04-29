
import java.io.*;


public class Main {
    public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    try{
        String line = br.readLine();
        int a = Integer.parseInt(line.split(" ")[0]);
        int b = Integer.parseInt(line.split(" ")[1]);

        bw.write((a+b)+"");

        bw.flush();
        bw.close();

    }catch(IOException e){
        throw new RuntimeException(e);
    }

    }
}