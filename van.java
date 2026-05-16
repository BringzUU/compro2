import java.util.Scanner;

public class van {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        int A=1,B=1,C=1;
        for(int i=0;i<N;i++){
            int x =sc.nextInt();
            if (A==B&&A==C||A<B&&A<C||A<B&&A==C||A==B&&A<C) {
                System.out.println("A");
                 A=A+x;
            }
            else if(B<A&&B<C||B==C){
                System.out.println("B");
                 B=B+x;
            }
            else{
            System.out.println("C");
            C=C+x;
            }
        }
    }
}
