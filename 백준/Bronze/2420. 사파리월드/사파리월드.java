import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        try{
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);

        ArrayList<Long> lists = new ArrayList<>();
        lists.add(a);
        lists.add(b);

        Collections.sort(lists);

        long x = lists.get(1);
        long y = lists.get(0);
        long res = x - y;
        bw.write(res + "");
        bw.flush();
        bw.close();



        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

}