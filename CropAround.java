import java.util.Scanner;

public class CropAround {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r =sc.nextInt();
        int c =sc.nextInt();
        int[][] arr =new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int ro =sc.nextInt();
        int co =sc.nextInt();
        int hei =sc.nextInt();
        int col =sc.nextInt();
        
    }
}
