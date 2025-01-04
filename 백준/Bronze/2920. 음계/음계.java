import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        try{
        String input = br.readLine();

        String type1 = "1 2 3 4 5 6 7 8";
        String type2 = "8 7 6 5 4 3 2 1";

        if(input.equals(type1)){
            bw.write("ascending");
        }else if(input.equals(type2)){
            bw.write("descending");
        }else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}