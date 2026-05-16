import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int A =scan.nextInt();
        if (A<=0||A>str.length()) {
            System.out.println("invalid position");
        }
        else{
            System.out.println(str.charAt(A-1));
        }
    }
}
