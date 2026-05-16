import java.util.Scanner;

class Precinct{
    public String name;
    public String[] region;
    public int[] team ;
    public int Max = 0;
    Precinct(String name,String[] region){
        this.name =name;
        this.region =region;
        team =new int[region.length];
    }

    void count(int numteam){
        if (numteam>=0&&numteam<team.length) {
            team[numteam]++;
            System.out.println(region[numteam]+" "+team[numteam]);
            if (team[numteam]>Max) {
                Max = team[numteam];
            }
        }
        else{
            System.out.println("invalid number");
        }
    }

    void printInfo(){
        for(int i=0;i<team.length;i++){
            System.out.println(i+1+" "+region[i]+" "+team[i]);
        }
    }

    void printMax(){
        for(int i=0;i<team.length;i++){
            if (team[i]==Max) {
                System.out.println(i+1+" "+region[i]+" "+team[i]);
            }
            
        }
    }
}

public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name =scan.nextLine();
        int N = scan.nextInt();
        String[] team =new String[N];
        for(int i=0;i<N;i++){
            team[i] =scan.next();
        }
        Precinct p =new Precinct(Name, team);
        int K =scan.nextInt();
        for(int i=0;i<K;i++){
            int P = scan.nextInt();
            if (P==1) {
                int token = scan.nextInt();
                p.count(token-1);
            }
            else if (P==2) {
                p.printInfo();
            }
            else if (P==3) {
                p.printMax();
            }
        }
    }
}
