import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        int K =sc.nextInt();
        int Max = -999999;
        int want=0,more=0;
        int[] array =new int[K] ;
        for(int i=0;i<K;i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i<K;i++){

            for(int j=0;j<K;j++){
if (N==array[j]) {
    want++;
}
            }
            if (want>Max) {
                Max=want;
                more=N;
            }
            N--;
            want=0;
        }
        System.out.println(more);
        System.out.println(Max);
    }
}
