import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Max=-99999;
        int count =1;
        String longestStr = "";
        for(;;){
            String str = scan.nextLine();
            if(str.length()<=0){
                break;
            }
            if (str.length()>Max) {
                Max=str.length();
                longestStr = str;
                count =1;
            }
            else if (str.length()==Max) {
                count++;
            }
        }
        System.out.println(Max);
        System.out.println(count);
    }
}
