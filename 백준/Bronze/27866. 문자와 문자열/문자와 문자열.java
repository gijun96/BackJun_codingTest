import java.io.*;


public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String s1 = br.readLine();
            String s2 = br.readLine();
            int i1 = Integer.parseInt(s2);
             bw.write(s1.charAt(i1-1));
            bw.flush();
            bw.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}