import java.util.Scanner;

public class SubMatch1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String x =sc.nextLine();
        String z =sc.nextLine();
        String a="";
        for(int i=0;i<3;i++){
            a = z.substring(i,i+3);
            if (x.indexOf(a)==-1) {
                System.out.println("No");
            }
            else{
            System.out.println(x.indexOf(a)+1);
        }
    }
    }
}
