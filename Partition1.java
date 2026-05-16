import java.util.Scanner;

public class Partition1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        int[] array=new int[N];
        int[] min=new int[N];
        int[] more=new int[N];
        int H=N/2;
        int W=0;
        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
            if (i==H) {
                W=array[i];
            }
        }
        int x =0;
        int y =0;
        for(int i=0;i<N;i++){
            if (array[i]<=W) {
                min[x]=array[i];
                x++;
            }
            else {
                more[y]=array[i];
                y++;
            }
        }
        for(int i=0;i<x;i++){
            System.out.print(min[i]+" ");
        }
        System.out.println();
        for(int i=0;i<y;i++){
            System.out.print(more[i]+" ");
        }
    }
}
