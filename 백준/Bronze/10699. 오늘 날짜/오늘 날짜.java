import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try{
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      Date now = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(now);
      bw.write(date);
      bw.flush();
      bw.close();


        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}