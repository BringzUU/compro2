import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        char z =(char) x;
        if (x<65||x>90) {
            System.out.println("unsupported code");
        }
        else{

            System.out.println(z);
        }
    }
}
