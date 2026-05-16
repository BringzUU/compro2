import java.util.Scanner;

public class Info1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String x = sc.nextLine();
        String z = sc.nextLine();
        if (x.indexOf(z)==-1) {
            System.out.println("string not found");
        }
        else{
            System.out.println(x.indexOf(z)+1);
        }
    }
}
