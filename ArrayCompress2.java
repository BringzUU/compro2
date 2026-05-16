import java.util.Scanner;

public class ArrayCompress2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        int[] arr =new int[N];
        int sum =0;
        for (int i = 0; i < N; i++){
            arr[i] =sc.nextInt();
        }
            int one =sc.nextInt();
            int two =sc.nextInt();
            int three =sc.nextInt();
            for(int i = 0; i < N; i++){
                if (arr[i]!=one&&arr[i]!=two&&arr[i]!=three){
                    sum=sum+arr[i];
                    if (arr[i]==one) {
                        System.out.print(sum+" ");
                        System.out.print(one+" ");
                        sum=0;
                    }
                    else if (arr[i]==two) {
                            System.out.print(sum+" ");
                        System.out.print(two+" ");
                        sum=0;
                        }
                    else if (arr[i]==three) {
                            System.out.print(sum+" ");
                        System.out.print(three+" ");
                        sum=0;
                        
                    }
                }

            }
            sc.close();
    }
}
