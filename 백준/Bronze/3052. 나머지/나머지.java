import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int i = 0; i <10; i++){
        String val = br.readLine();
        int input = Integer.parseInt(val)%42;
        resultList.add(input);
        }


        HashSet<Integer> set = new HashSet<>(resultList);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(set.size()+"");
        bw.flush();
        bw.close();

    }catch (IOException e){
        throw new RuntimeException(e);
    }


    }
}