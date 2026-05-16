import java.util.Scanner;

public class ArrayExploration2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] array = new int[R][C];
        int plus = 0;
        int minus = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int N = sc.nextInt();
        int[] r = new int[N];
        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
        r[i] = sc.nextInt();
        c[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (r[i] > 0 && r[i] <= R && c[i] > 0 && c[i] <= C) {
                if (array[r[i]-1][c[i]-1] > 0) {
                    plus++;
                } else if (array[r[i]-1][c[i]-1] < 0) {
                    minus++;
                }
                if (array[r[i]-1][c[i]-1] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            else{
                int j=i;
                for(;;){
                    if (r[j] > 0 && r[j] <= R && c[j] > 0 && c[j] <= C){
                        if (array[r[i]-1][c[i]-1] > 0) {
                            plus++;
                        } else if (array[r[i]-1][c[i]-1] < 0) {
                            minus++;
                        }
                        if (array[r[i]-1][c[i]-1] % 2 == 0) {
                            even++;
                        } else {
                            odd++;
                        }
                        break;
                    }
                    else{
                        j--;
                    }
                }
            }
        }
        System.out.println(plus + " " + minus + " " + even + " " + odd);
        sc.close();
    }
}
