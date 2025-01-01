
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String N = br.readLine();
            int Num = Integer.parseInt(N);

            String r1 = br.readLine();
            String[] totalIngredient = r1.split(" ");
            totalIngredient = Arrays.copyOf(totalIngredient, Math.min(totalIngredient.length, Num));

            String r2 = br.readLine();
            String[] useIngredient = r2.split(" ");
            useIngredient = Arrays.copyOf(useIngredient, Math.min(useIngredient.length, Num));

            Set<String> setTotal = new HashSet<>(Arrays.asList(totalIngredient));
            Set<String> setUse = new HashSet<>(Arrays.asList(useIngredient));

            setTotal.removeAll(setUse);

            //bw.write(setTotal.toString());
            for(String result : setTotal){
              bw.write(result+"\n");
            }
            bw.flush();
            bw.close();






        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}