import java.util.Scanner;

public class re {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        int [] arr1 = new int[N+1];
        int [] arr2 = new int[N+1];

        int K =sc.nextInt();
        int P =sc.nextInt();
        for(int p=0; p < P ;p++){
            int idx =sc.nextInt();
            if (arr1[idx]<K) {
                arr1[idx]++;
                System.out.println(1);
            }
            else{
                arr2[idx]++;
                System.out.println(2);
            }
        }
        for(int i=1;i<=N;i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        for(int i=1;i<=N;i++){
            System.out.print(arr2[i]+ " ");
        }
    }
}
