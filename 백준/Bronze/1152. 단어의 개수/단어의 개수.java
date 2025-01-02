import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String[] row = br.readLine().split(" ");
            ArrayList<String> strArr = new ArrayList<>();
            for(int a= 0; a < row.length;a++){
                if(!row[a].equals("")){
                    strArr.add(row[a]);
                }
            }
            bw.write(strArr.size()+"");

            bw.flush();
            bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}