import java.util.Scanner;

public class Numtable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R =sc.nextInt();
        int C =sc.nextInt();
        int[][] array =new int[R][C] ;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                array[i][j] =sc.nextInt();
            }
        }
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            if (r>R||c>C||r<1||c<1) {
                System.out.print("-");
            }
            else{
                System.out.print(array[r-1][c-1]);
            }
        }
    }
}
