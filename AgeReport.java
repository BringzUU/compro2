import java.util.Scanner;
class Agecheck{
    
    int check(int[] iDs, int[] ages,int N,int min,int max){
    int member =0;
        for(int i=0;i<N;i++){
            if (ages[i]>=min&&ages[i]<=max) {
                System.out.println(iDs[i]);
                member++;
            }
        }
        return member;
    }
    
}

public class AgeReport {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    int[] IDs = new int[N];
    int[] ages = new int[N];
    for(int i=0;i<N;i++){
        IDs[i] = sc.nextInt();
        ages[i] = sc.nextInt();
    }
    int minage =sc.nextInt();
    int maxage =sc.nextInt();
    Agecheck Age= new Agecheck();
    int member = Age.check(IDs,ages,N,minage,maxage);
    System.out.println("There are "+member+" persons in age range of "+minage+" to "+maxage);
    sc.close();
}
}