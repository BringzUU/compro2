import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double number =sc.nextDouble();
        double num =sc.nextDouble();
        double cal =sc.nextDouble();
        if (cal==0) {
            System.out.println("cannot divide by zero");
        }
        else{
        double x =number+num;
        double y =x/cal;
        System.out.println(String.format("%.6f", y));
    }
    sc.close();
}
    }
