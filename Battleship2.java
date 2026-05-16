import java.util.Scanner;

public class Battleship2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R =sc.nextInt();
        int C =sc.nextInt();
        int K =sc.nextInt();
        int in=0;
        int out=0;
        for(int i=0;i<K;i++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            if (r>R||c>C||r<1||c<1) {
                out++;
            }
            else{
                in++;
            }
        }
        System.out.println(in);
        System.out.println(out);
        sc.close();
    }
}
