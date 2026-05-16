import java.util.Scanner;

class Route2 {
    public String[] name;
    public int sum;

    Route2(String[] name, int sum) {
        this.name = name;
        this.sum =sum;
    }

    void summarizeRoute(){
        System.out.print(name[0]+" "+name[name.length-1]+" ");
        System.out.print(sum);
    }
    
}

public class BusRoute2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N];
        int[] distances = new int[N];
        int sum =0;
        for (int i = 0; i < N; ++i) {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }

        for(int i = 0; i < N; ++i){
            sum +=distances[i];
        }
        Route2 R = new Route2(names,sum);
        R.summarizeRoute();
        scan.close();
    }
}