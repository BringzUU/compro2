import java.util.Scanner;

public class GeneticCode_Task2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String x = sc.nextLine();
        String n1 = "<";
        String n2 = ">";
        int index=0;
        for(;;){
        int y = x.indexOf(n1, index);
        int z = x.indexOf(n2, index);
        if (z==-1) {
            break;
        }
        else{
            index=z+1;
            for(int i=y+1;i<z;i++){
                System.out.print(x.charAt(i));
            }
            System.out.println();
        }
    }
}
}