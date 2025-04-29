import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int n = Integer.parseInt(br.readLine());

            ArrayList<Point> points = new ArrayList<>();

            for(int i = 0; i<n; i++){
                String input = br.readLine();
                int x = Integer.parseInt(input.split(" ")[0]);
                int y = Integer.parseInt(input.split(" ")[1]);
                points.add(new Point(x, y));
            }

          points.sort(Comparator.comparingInt((Point p)->p.x)
                  .thenComparingInt(p -> p.y));

            for(Point p : points){
                bw.write(p.x +" "+ p.y + "\n");
            }

            bw.flush();
            bw.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    static class Point {
        int x,y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

}