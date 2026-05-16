import java.util.Scanner;

public class Battleship4Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] map = new int[R][C];
        int nShip = 0;
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                map[r][c] = sc.nextInt();
                nShip += map[r][c];
            }
        }

        int firstHit = 0;
        int firstMiss = 0;
        int repeatHit = 0;
        int repeatMiss = 0;
        int out = 0;

        int firstHitIdx = -1;
        int lastHitIdx = -1;

        int K = sc.nextInt();
        for (int k = 1; k <= K; ++k) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            boolean isValidR = (0 <= r && r < R);
            boolean isValidC = (0 <= c && c < C);

            // out
            if (!isValidR || !isValidC) {
                out++;
            }
            // firstHit
            else if (map[r][c] == 1) {
                firstHit++;
                nShip--;
                map[r][c] = 2;

                if (firstHitIdx == -1) {
                    firstHitIdx = k;
                }

                if (nShip == 0) {
                    lastHitIdx = k;
                }
            }
            // firstMiss
            else if (map[r][c] == 0) {
                firstMiss++;
                map[r][c] = -1;
            }
            // repeatHit
            else if (map[r][c] == 2) {
                repeatHit++;
            }
            // repeatMiss
            else if (map[r][c] == -1) {
                repeatMiss++;
            }
        }
    
        System.out.println(firstHit);
        System.out.println(firstMiss);
        System.out.println(repeatHit);
        System.out.println(repeatMiss);
        System.out.println(out);

        if (nShip > 0) {
            System.out.println("battleship " + firstHitIdx);
        } else {
            System.out.println("attacker " + lastHitIdx);
        }
        sc.close();
    }
}