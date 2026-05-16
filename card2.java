import java.util.Scanner;

public class card2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++){
            String msg1 =sc.next();
            String msg2 =sc.next();

            char c1=msg1.charAt(0);
            char c2=msg1.charAt(1);
            char c3=msg2.charAt(0);
            char c4=msg2.charAt(1);
            int S1;
            int S2;
            if (c1==c2) {
                if (c3==c4) {
                    if (c1<c3) {
                        System.out.print("W");
                    }
                    else if (c1==c3) {
                        System.out.print("D");
                    }
                    else {
                        System.out.print("L");
                    }
                }
                else{
                    System.out.print("W");
                }
            }
                else if (c3==c4) {
                    if (c1!=c2) {
                        System.out.print("L");
                    }
                }
            else{
            if (c1<c2) {
                S1 =(int)c1;
            }
            else{
                S1=(int)c2;
            }
            if (c3<c4) {
                S2 =(int)c3;
            }
            else{
                S2=(int)c4;
            }
            if (S1<S2) {
                System.out.print("W");
            }
            else if (S1==S2) {
                System.out.print("D");
            }
            else {
                System.out.print("L");
            }
        }
        }
        sc.close();
    }
}
