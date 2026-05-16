import java.util.Scanner;

public class ArrayCompress {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        int[] arr =new int[N];
        int sum =0;
        for (int i = 0; i < N; i++){
            arr[i] =sc.nextInt();
        }
            int c =sc.nextInt();
            for(int i = 0; i < N; i++){
                if (arr[i]==c) {
                    System.out.print(sum+" ");
                    System.out.print(c+" ");
                    sum=0;
                }
                else{
                sum=sum+arr[i];
}
            }
            System.out.print(sum+" ");
            sc.close();
        }
}
