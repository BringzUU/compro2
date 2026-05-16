import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        int z =sc.nextInt();
        if (z==1) {
            int sum = x+y;
            System.out.println(sum);
        }
        else if (z==2) {
            int sum =x-y;
            System.out.println(sum);
        }
        else if (z==3) {
            int sum =x*y;
            System.out.println(sum);
        }
        else if (z==4) {
            if (y==0) {
                System.out.println("cannot divide by zero");
            }
            else{
                int sum =x/y;
            System.out.println(sum);
            }
        }
        else if (z==5) {
            if (y==0) {
                System.out.println("cannot divide by zero");
            }
            else{
                int sum =x%y;
            System.out.println(sum);
            }
        }
        {
    }
    sc.close();
}
    }
