import java.util.Scanner;

public class Billboard1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        int k=0;
        int[] array =new int[N] ;
        for(int i=0;i<N;i++){
            array[i] =sc.nextInt();
        }
        for(int i=0;i<5;i++){
            
            if (k==N) {
                k=0;
            }
            System.out.print(array[k]+" ");
            k++;
        }

    }
}