
import java.util.Scanner;

public class UnderLine1 {
    static void Line(int N ,String K){
        int index =0;
        int start =0;
        String space =" ";
        int A=0;
        for(;;){
            int W = K.indexOf(space, index);
            index = W+1;
            A++;
            if (A==N) {
                W=K.length();
            }
            System.out.println(K.substring(start, W));
            start = W+1;
            for(int i=0;i<20;i++){
                System.out.print("-");
            }
            System.out.println();
            if (A==N) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        sc.nextLine();
        String K = sc.nextLine();
        Line(N,K);
    }
}
