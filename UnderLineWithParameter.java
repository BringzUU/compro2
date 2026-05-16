import java.util.Scanner;

public class UnderLineWithParameter {
    static void Name(String K){

        System.out.println(K);
    }
    static void Space(int SP){
        for(int j=0;j<SP;j++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
for(int i=0;i<N;i++){
    String K = sc.next();
    int SP = sc.nextInt();
    Name(K);
    Space(SP);
}
    }
}
