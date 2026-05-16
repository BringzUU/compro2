import java.util.Scanner;

public class SupremeMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        int[] array=new int[N];
        int start=0;
        int max=-99;
        int sumax=-99;
        int SSMAX=0;
        int ESMAX=0;

        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0;i<N;i++){
            if (array[i]==0) {
                continue;
            }
            if (array[i]>max) {
                max = array[i];
            }
            if (array[i+1]==0) {
                if (sumax<max) {
                    sumax=max;
                    SSMAX=start;
                    ESMAX=i;
                }
                System.out.print(max+" ");
                max=0;
                start=i+2;
            }
        }
        System.out.println();
        System.out.println(sumax);
        for(int i=SSMAX;i<=ESMAX;i++){
            System.out.print(array[i]+" ");
        }
    }
}
