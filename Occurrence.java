import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        int M = 0;
        int[] array =new int[N] ;
        for(int i=0;i<N;i++){
            array[i] = sc.nextInt();
        }
        int K =sc.nextInt();
        for(int i=0;i<N;i++){
            if (array[i]==K) {
                System.out.print(i+1+" ");
                M++;
            }
        }
        if (M==0) {
            System.out.println("0");
        }
    }
}
