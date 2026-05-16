import java.util.Scanner;

public class partition2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        int[] array=new int[N];
        int[] min=new int[N];
        int[] more=new int[N];
        int[] now=new int[N];
        int H=N/2;
        int W=0;
        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
            if (i==H) {
                W=array[i];
            }
        }

        int x =0;
        int y=0;
        int z=0;
        for(int i=0;i<N;i++){
            if (array[i]<=W) {
                min[x]=array[i];
                x++;
            }
        }

        H=x/2;
        for(int i=0;i<x;i++){
            if (i==H) {
                W=min[i];
                
            }
            
        }
        for(int i=0;i<x;i++){
            if (min[i]<=W) {
                now[z]=min[i];
                z++;
            }
            else {
                more[y]=min[i];
                y++;
            }
        }

        for(int i=0;i<z;i++){
            System.out.print(now[i]+" ");
        }
        System.out.println();
        for(int i=0;i<y;i++){
            System.out.print(more[i]+" ");
        }
    }
}
