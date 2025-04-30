import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{

            while(true){

                ArrayList<Integer> tris = new ArrayList<>();
                String input = br.readLine();
                int a = Integer.parseInt(input.split(" ")[0]);
                int b = Integer.parseInt(input.split(" ")[1]);
                int c = Integer.parseInt(input.split(" ")[2]);

                if(a == 0 && b == 0 && c ==0){
                    break;
                }
                tris.add(a);
                tris.add(b);
                tris.add(c);
                // 오름차순 정렬
                Collections.sort(tris);
                int x = tris.get(0);
                int y = tris.get(1);
                int z = tris.get(2);

                if(z*z == x*x + y*y){
                    bw.write("right"+ "\n");
                }else{
                    bw.write("wrong" + "\n");
                }

                tris.clear();
            }
            bw.flush();
            bw.close();


        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

}