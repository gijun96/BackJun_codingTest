
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> resultList = new ArrayList<>();
    for(int i = 0; i<30; i++){
        resultList.add(i+1);
    }




        try{

            for(int j = 0; j<28; j++) {
                String input = br.readLine();
                int value = Integer.parseInt(input);

                Iterator<Integer> iterator = resultList.iterator();
                while(iterator.hasNext()){
                    int num = iterator.next();
                    if(num == value){
                        iterator.remove();
                        break;
                    }
                }
            }
            Collections.sort(resultList);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            for(int num : resultList){
                bw.write(num+"\n");
            }

            bw.flush();
            bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }





    }



}