import java.util.Scanner;
class Route1 {
    public String[] name;
    public int[] distances;
    Route1(String[]name,int[]distances){
        this.name =name;
        this.distances =distances;
    }

    void getStopInfo(int num){
        if (num-1<0||num>name.length) {
            System.out.println("invalid number");
        }
        else{
            System.out.println(name[num-1]+" "+distances[num-1]);
        }
    }
}
public class BusRoute1 {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 final int N = scan.nextInt();
 String[] names = new String[N];
 int[] distances = new int[N];
 for(int i = 0; i < N; ++i) {
 names[i] = scan.next();
 distances[i] = scan.nextInt();
 }

 Route1 R = new Route1(names,distances);
 final int K = scan.nextInt();
 for(int i = 0; i < K; ++i) {
 int num = scan.nextInt();
 R.getStopInfo(num);
 }
 scan.close();
 }
}