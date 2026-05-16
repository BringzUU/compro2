import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        int[] sale =new int[N];
        int[] perday =new int[3];
        int day =0;
        int salay =0;
        int sum=0;
        for(int i=0;i<N;i++){
            sale[i] =sc.nextInt();
        }
        for(int i=0;i<3;i++){
            perday[i] =sc.nextInt();
        }
        for(;;){
            for(int i=0;i<perday[day];i++){
                if (salay==N) {
                    System.out.print(sum+" ");
                    break;
                }
                sum+=sale[salay];
                salay++;
            }
            if (salay==N) {
                break;
            }
            System.out.print(sum+" ");
            sum=0;
            day++;
        }

    }
}
