import java.io.*;


public class Main {
    public static void main(String[] args) {
        try{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 8개 상자
        String fBox = br.readLine();
        int f = Integer.parseInt(fBox);
        // 3개 상자
        String sBox = br.readLine();
        int s = Integer.parseInt(sBox);

        int count = (f*8)+(s*3);
        String result = count-28+"";
        bw.write(result);
        bw.flush();
        bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}