import java.util.Scanner;

public class Info2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String x = sc.nextLine();
        String z = sc.nextLine();
        int num=0;
        int index=0;
        for(;;){
        int y = x.indexOf(z,index);
        if (y==-1) {
            break;
        }
        else{
            index=y+1;
            System.out.print(y+1+" ");
            num++;
        }
    }
    if (num==0) {
        System.out.println("string not found");
    }
    }
}
