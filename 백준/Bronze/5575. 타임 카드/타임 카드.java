import java.io.*;


public class Main {
    public static void main(String[] args) {
        try{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] Times =  new String[3];

        for(int i = 0; i<3; i++){
            String f = br.readLine();
            int h1 = Integer.parseInt(f.split(" ")[0]);
            int m1 = Integer.parseInt(f.split(" ")[1]);
            int s1 = Integer.parseInt(f.split(" ")[2]);
            int h2 = Integer.parseInt(f.split(" ")[3]);
            int m2 = Integer.parseInt(f.split(" ")[4]);
            int s2 = Integer.parseInt(f.split(" ")[5]);

            int r1;
            int r2;
            int r3;

            if(s2 < s1){
                m2 = m2-1;
                s2 = s2+60;
            }
            r3 = s2-s1;

            if(m2 < m1){
                h2 = h2-1;
                m2= m2+60;
            }
            r2 = m2-m1;

            r1 = h2-h1;
            Times[i] = r1+" "+r2+" "+r3;
        }

        for(String a : Times){
            bw.write(a+"\n");
        }



        bw.flush();
        bw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}