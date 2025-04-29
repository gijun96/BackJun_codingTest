
import java.io.*;


public class Main {
    public static void main(String[] args) {
   
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    try{
       
        bw.write("63"+ "\n");
        bw.write("kj5733");

        bw.flush();
        bw.close();
    }catch(IOException e){
        throw new RuntimeException(e);
    }

    }
}