
import java.io.*;


public class Main {
    public static void main(String[] args) {
        try{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String word = br.readLine();

    // 아침에 올라가는거리
    int A = Integer.parseInt(word.split(" ")[0]);
    // 밤에 미끄러지는 거리
    int B = Integer.parseInt(word.split(" ")[1]);
    // 목표 거리
    int V = Integer.parseInt(word.split(" ")[2]);

    int day = (V-A)/ (A-B);
    if( (V-A)% (A-B) != 0){
        day++;
    }
    day++;

    bw.write(day+"");
    bw.flush();
    bw.close();


        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}