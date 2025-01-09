import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Boolean end = false;
        ArrayList<String> list = new ArrayList<>();
        while(!end){
            String[] line = br.readLine().split(" ");

            int a= Integer.parseInt(line[0]);
            int b= Integer.parseInt(line[1]);
            int c= Integer.parseInt(line[2]);
            if(a == 0 && b == 0&& c ==0){
                end =true;
                break;
            }

            if(((a*a) == (b*b)+(c*c))||
                    ((b*b) == (a*a)+(c*c))||
                    ((c*c) == (a*a)+(b*b))){
                list.add("right");
            }else{
                list.add("wrong");
            }


        }
        for(String r : list){
            bw.write(r+"\n");
        }
        bw.flush();
        bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}