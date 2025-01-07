import java.io.*;


public class Main {
    public static void main(String[] args) {
        try{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String word = br.readLine();
    int count = Integer.parseInt(word);
    int[][] list = new int[count][2];

   for(int i =0; i<count; i++){
       int[] r = new int[2];
    String[] line = br.readLine().split(" ");
    int a = Integer.parseInt(line[0]);
       int b = Integer.parseInt(line[1]);
       r[0] =a;
       r[1] = b;

        list[i] = r;
   }
   String result = "";
   for(int[] j : list){
       int c = 0;

       for(int[] k : list){
           if(j[0] < k[0] && j[1] < k[1]){
               c += 1;
           }
       }
       result += (c+1)+ " ";
   }

   bw.write(result);

      bw.flush();
      bw.close();


        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}