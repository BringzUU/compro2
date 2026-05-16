import java.util.Arrays;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int [] team1 = new int[N];
        int [] team2 = new int[N];
        for(int i=0;i<N;i++){
            team1[i] =sc.nextInt();
        }
        for(int i=0;i<N;i++){
            team2[i] =sc.nextInt();
        }
        System.out.println("team1: " +Arrays.toString(team1));
        System.out.println("team2: " +Arrays.toString(team2));
        int S1 =0;
        int S2=0;
        for(int i=0;i<N;i++){
            if(team1[1]>team2[i]){
                S1 += 2;
            }
            else if (team1[i]==team2[i]) {
                S1++;
                S2++;
            }
            else{
                S2+=2;
            }
        }
        if (S1>S2) {
            System.out.println("Team 1 wins");
            System.out.println("Score "+S1+" to "+S2);
        }
        else if (S1==S2) {
            System.out.println("Draw game");
            System.out.println("Score "+S1+" to "+S2);
        }
        else {
            System.out.println("Team 2 wins");
            System.out.println("Score "+S1+" to "+S2);
        }
    }
}
