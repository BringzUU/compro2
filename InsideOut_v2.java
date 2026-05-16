import java.util.Scanner;

public class InsideOut_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        int L = msg.length();
        int mid = L / 2;
        int even = 0;

        int x = sc.nextInt();

        if (L % 2 == 0) {
            even = 1;
        } else {
            System.out.print(msg.charAt(x));
        }

        for (int i = 1 - even; i <= mid - even; ++i) {
            int a = x - i - even;
            int b = x + i;
            if (a < 0) {
                a += L;
            }
            if (L <= b) {
                b -= L;
            }
            System.out.printf("%c%c", msg.charAt(a), msg.charAt(b));
        }
        System.out.println();
    }
}

// 01234
// 2 13 04

// 012345
// 23 14 05