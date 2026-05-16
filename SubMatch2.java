import java.util.Scanner;

public class SubMatch2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String x =sc.nextLine();
        String z =sc.nextLine();
        String a="";
        int N =z.length();
        for(int i=0;i<N-2;i++){
            a = z.substring(i,i+3);
            if (x.indexOf(a)==-1) {
                System.out.println("No");
            }
            else{
            System.out.println(x.indexOf(a)+1);
        }
    }
    sc.close();
    }
}
