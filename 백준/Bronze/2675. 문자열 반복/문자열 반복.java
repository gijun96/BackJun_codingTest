import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            ArrayList<String> resultList = new ArrayList<>();
            String c = br.readLine();
            int count = Integer.parseInt(c);
            for(int i = 0; i < count; i++){
                String[] arr = br.readLine().split(" ");
                String str = "";
                int loop = Integer.parseInt(arr[0]);
                for (int j = 0; j < arr[1].length(); j++) {
                    for (int k = 0; k < loop; k++) {
                        str = str + arr[1].charAt(j);
                    }
                }
                resultList.add(str);
            }

            for(String txt : resultList){
                bw.write(txt+"\n");
            }
            bw.flush();
            bw.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}