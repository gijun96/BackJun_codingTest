import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        try{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String line = br.readLine();
            int count = Integer.parseInt(line);
            String cc = br.readLine();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i<count;i++){
                String val = cc.split(" ")[i];
                list.add(Integer.parseInt(val));
            }
           
            int max = Collections.max(list);
            double sumScore =  0;

            for (int li : list){

                    sumScore += (double)li/max*100;

            }

            bw.write((sumScore/list.size())+"");
            bw.flush();
            bw.close();


        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}