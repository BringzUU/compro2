import java.util.Scanner;
class Route3 {
    public String[] name;
    public int[] distances;
    public int sum;
    Route3(String[]name,int[]distances){
        this.name =name;
        this.distances =distances;
    }

    private void summarizeRoute(int start , int stop ,int sum){
        System.out.println(name[start-1]+" "+name[stop-1]+" "+sum);
    }

    void getTripInfo(int start,int stop){
        if (start-1<0||start>name.length||stop-1<0||stop>name.length||stop<start||start==stop) {
            System.out.println("invalid number");
        }
        else{
            for(int i = start; i < stop; ++i){
                sum += distances[i];
            }
            summarizeRoute(start,stop,sum);
        }
        sum=0;
    }
}
public class BusRoute3 {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 final int N = scan.nextInt();
 String[] names = new String[N];
 int[] distances = new int[N];
 for(int i = 0; i < N; ++i) {
 names[i] = scan.next();
 distances[i] = scan.nextInt();
 }

 Route3 R = new Route3(names,distances);
 final int K = scan.nextInt();
 for(int i = 0; i < K; ++i) {
 int start = scan.nextInt();
 int stop = scan.nextInt();
 R.getTripInfo(start,stop);
 }
 scan.close();
 }
}