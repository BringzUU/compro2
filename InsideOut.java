import java.util.Scanner;

public class InsideOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int mid = N.length() / 2;
        int l, r;
        if (mid % 2 == 0) {
            l = mid - 1;
            r = mid;
        } else {
            l = mid - 1;
            r = mid + 1;
            System.out.print(N.charAt(mid));
        }


        for (;;) {
            if (l >= 0) {
                System.out.print(N.charAt(l));
                l--;
            }
            System.out.print(N.charAt(r));
            r++;
            if (r == N.length()) {
                break;
            }
        }
    }
}


// 01234
// 2 13 04
