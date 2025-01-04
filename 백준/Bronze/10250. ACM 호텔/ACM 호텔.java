import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        try{
        String strCount = br.readLine();
        int count = Integer.parseInt(strCount);
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i< count; i++){
            String[] row = br.readLine().split(" ");
            // 층
            int floor = Integer.parseInt(row[0]);
            // 방
            int line = Integer.parseInt(row[1]);
            // 순서
            int N = Integer.parseInt(row[2]);
            ArrayList<Integer> roomList = new ArrayList<>();
            for(int j =1;j<=line;j++){
                for(int f =1;f<=floor;f++){
                    int cc = f*100+j;
                    roomList.add(cc);
                }
            }
            int rcc = roomList.get(N-1);
            result.add(rcc+"");

        }

        for(String rr : result){
            bw.write(rr+"\n");
        }
        bw.flush();
        bw.close();


        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}