
import java.io.*;
public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    try{

        String result = "";
        for(int i = 0; i<3; i++){
            String r = br.readLine();
            String res = Check(i, r);
            if(!res.equals("Error")) result = res;
        }

        bw.write(result);
        bw.flush();
        bw.close();

    }catch (IOException e){
        throw new RuntimeException(e);
    }


    }

    private static String Check(int a, String s){
        try{
            int res;
            int val = Integer.parseInt(s);
            if(a == 0) res = val+3;
            else if(a == 1) res = val+2;
            else res = val+1;

            if (res % 15 == 0) return "FizzBuzz";
            else if (res % 3 == 0) return "Fizz";
            else if(res % 5 == 0) return "Buzz";
            else return String.valueOf(res);
        }catch (NumberFormatException ne){
            return "Error";
        }
    }

}