import java.util.Scanner;

public class voice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = 0, F = 0;
        for (int i = 1; i < N + 1; i++) {
            int gen = sc.nextInt();
            int m = sc.nextInt();
            int f = sc.nextInt();
            if (m > 8 && f <= 8) {
                if (M < K) {
                    M++;
                    System.out.println(i + " 1");
                }
            } else if (m <= 8 && f > 8) {
                if (F < K) {
                    F++;
                    System.out.println(i + " 2");
                }
            } else if (m > 8 && f > 8) {
                if (gen == 1) {
                    if (M < K) {
                        M++;
                        System.out.println(i + " 1");
                    } else if (F < K) {
                        F++;
                        System.out.println(i + " 2");
                    }
                } else if (gen == 2) {

                    if (F < K) {
                        F++;
                        System.out.println(i + " 2");
                    } else if (M < K) {
                        M++;
                        System.out.println(i + " 1");
                    }
                }
            }
            // 1. ชาย > 8 หญิง <= 8
            // 1.1. M < K
            // 2. ชาย <= 8 หญิง > 8
            // 2.1 F < K
            // 3. ชาย > 8 หญิง > 8
            // 3.1 gen == 1
            // 3.1.1 M < K
            // 3.1.2 F < K
            // 3.2 gen == 2
            // 3.2.1 F<K
            // 3.2.2 M<K
        }
    }
}
