import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String c = sc.nextLine();
        int index = 0;
        int count =0;
        int a=x.indexOf(c);
        if (x.indexOf(c)==-1) {
            System.out.println("no target character found");
        }
        else{
        for (;;) {
            String b = x.substring(index,a);
            if (b.length()>0) {
                System.out.println(b);
                count++;
            }
            index = a + 1;
            a=x.indexOf(c, index);
            if (a == -1) {
                b=x.substring(index);
                if (b.length()>0) {
                    System.out.println(b);
                    count++;
                }
                break;
            }
        }
        if (count==0) {
            System.out.println("no output");
        }
    }
    }
}
