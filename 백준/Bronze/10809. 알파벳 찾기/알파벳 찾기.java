import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        try{
        String word = br.readLine();
            String[] abc = {
                    "a", "b", "c", "d", "e", "f", "g", "h",
                    "i", "j", "k", "l", "m", "n", "o", "p",
                    "q", "r", "s", "t", "u", "v", "w", "x",
                    "y", "z"
            };

        String sr = "";
        for(int i =0; i< abc.length; i++){
            int a = word.indexOf(abc[i]);
            sr += a+" ";
        }

        bw.write(sr);
        bw.flush();
        bw.close();



        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}