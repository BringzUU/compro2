import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Max=-99999;
        for(int i=0;i<5;i++){
            String str = scan.nextLine();
            if (Max<str.length()) {
                Max=str.length();
            }
        }
        System.out.println(Max);
    }
}