import java.io.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


      try{
        String r1 = br.readLine();
          String r2 = br.readLine();
          String r3 = br.readLine();

          int a = Integer.parseInt(r1);
          int b = Integer.parseInt(r2);
          int c = Integer.parseInt(r3);
          int[] result = new int[10];
          Arrays.fill(result, 0);
          String s = (a*b*c)+"";
          for(int i =0; i< s.length();i++){
              int aaa = (int)s.charAt(i);
              if(aaa >= 48){
                  aaa= aaa-48;
              }
            
              result[aaa] += 1;
}
        for(int bbb : result){
            bw.write(bbb+"\n");
        }
        bw.flush();
        bw.close();



      }catch (IOException e){
          throw new RuntimeException(e);
      }

    }
}