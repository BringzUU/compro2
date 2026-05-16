import java.util.Scanner;

public class SpellChecking1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        String[] str1 = new String[N];
        for(int i=0;i<N;i++){
            str1[i] =sc.next();
        }
        for(int i=0;i<10;i++){
            String str2 =sc.next();
            boolean a=false;
            for(int j=0;j<N;j++){
                if(str2.equals(str1[j])==true){
                    a =true;
                }
        }
        if (a==true) {
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
    }
}