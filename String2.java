import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Max=-99999;
        String longestStr = "";
        for(;;){
            String str = scan.nextLine();
            if (str.length()<=0) {
                break;
            }
            if (str.length()>=Max) {
                Max=str.length();
                longestStr = str;
            }
        }
        System.out.println(longestStr);
    }
}
