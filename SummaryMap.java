import java.util.Scanner;

public class SummaryMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int oder = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = 0;
            }
        }
        for(int i = 0; i < oder; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            boolean one = false;
            if(p <= 0 || p > row || q <= 0 || q >col){
                
            }
            else if (p + h - 1 > row || q + w - 1 > col){
                
            }
            else {
                if(arr[p - 1][q - 1] == 0){
                    for(int j = p - 1; j < p + h - 1; j++){
                        for(int k = q - 1; k < q + w - 1; k++){
                            if(arr[j][k] == 1){
                                one = true;
                            }
                        }
                    }
                    if(!one){
                        for(int j = p - 1; j < p + h - 1; j++){
                            for(int k = q - 1; k < q + w - 1; k++){
                                arr[j][k] = 1;
                            } 
                        }
                    }
                }
            }
            // System.out.println("----------------");
        }
        for(int j = 0; j < row; j++){
            for(int k = 0; k < col; k++){
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
    }
}