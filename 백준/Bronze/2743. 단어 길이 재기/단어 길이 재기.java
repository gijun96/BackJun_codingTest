import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String word = br.readLine();


      bw.write(word.length()+"");
      bw.flush();
      bw.close();


        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}