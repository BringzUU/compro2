import java.util.Scanner;

public class ArrayExploration1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R =sc.nextInt();
        int C =sc.nextInt();
        int[][] array =new int[R][C] ;
        int plus = 0;
        int minus = 0;
        int even = 0;
        int odd = 0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                array[i][j] =sc.nextInt();
            }
        }
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int r =sc.nextInt();
            int c =sc.nextInt();
            if (r>0&&r<=R&&c>0&&c<=C) {
                r--;
                c--;
                if (array[r][c]>0) {
                    plus++;
                }
                else if (array[r][c]<0) {
                    minus++;
                }
                if (array[r][c]%2==0) {
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println(plus+" "+minus+" "+even+" "+odd);
        sc.close();
    }
}
