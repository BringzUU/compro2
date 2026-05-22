import java.util.Scanner;

public class MidtermArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String[][] ticket = new String[x][x];
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < x; j++) {
            ticket[i][j]="O";
        }
    }
    int count=x;
    int X =0;
    for (;;) {
        int r = sc.nextInt();
        int n = sc.nextInt();
        if(r<=0||n<=0){
            break;
        }
        else{
        for (int i = 0; i < x; i++) {
            if (ticket[r-1][i]=="X") {
                X++;
            }
        }
        count -=X;
        if (count>=n) {
            for (int i = X; i < X+n; i++) {
                ticket[r-1][i]="X";
            }
            System.out.println("reverse");
        }
        else{
            System.out.println("full");
        }
        }
        count=x;
        X = 0;
    }
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < x; j++) {
            System.out.print(ticket[i][j]+" ");
        }
        System.out.println();
    }
}
}

/*3
O O O
O O O
O O O

1 2     reverse
2 3     reverse
2 1     full
-1 -1   X X O
        X X X
        O O O*/
