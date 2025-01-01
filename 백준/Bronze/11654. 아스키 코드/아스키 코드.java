import java.io.*;


public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String s1 = br.readLine();
            int c = (int)(s1.charAt(0));
            bw.write(c+"");
            bw.flush();
            bw.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}