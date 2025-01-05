import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        try{
        String strCount = br.readLine();
        int count = Integer.parseInt(strCount);
        int[] result = new int[count];
        for(int i = 0; i< count; i++){
            ArrayList<Integer> scoreList = new ArrayList<>();
            String l = br.readLine();
            for(int j = 0; j< l.length();j++){
                int score = 0;
                char k = l.charAt(j);
                String val = k+"";
                if(val.equals("O")){
                    if(j != 0 && (l.charAt(j-1)+"").equals(val)){
                       score = scoreList.get(j-1)+1;
                    }else{
                        score =1;
                    }

                }
                scoreList.add(score);

            }
            int rr = 0;
            for(int a : scoreList){
                rr = rr+a;
                result[i] = rr;
            }
        }

        for(int sr : result){
            bw.write(sr+"\n");
        }
        bw.flush();
        bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}