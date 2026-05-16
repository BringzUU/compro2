import java.util.Scanner; 

class GameCharacter{
String name;
int attack;
int defense;
int level;

void stat(){
    System.out.print(name+" ");
    System.out.print(level+" ");
    System.out.print(attack+" ");
    System.out.print(defense);
    System.out.println();
}
}
class Hero extends GameCharacter{
    Hero(String name){
        this.name =name;
        this.attack=10;
        this.defense=5;
        this.level=1;
    }
    void hit(Monster x){
        int score = x.score;
        int lv =score/100;
        this.attack+=lv*3;
        this.defense+=lv*2;
        this.level+=lv;
    }
}
class Monster extends GameCharacter{
    int score;
    Monster(String name, int level, int score){
        this.name =name;
        this.level=level;
        this.score=score;
        this.attack=level*2;
        this.defense=level*3;
    }
}
public class RolePlayingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        Hero[] heroes = new Hero[M];
        for(int i=0;i<M;i++){
        String name = scan.next();
        heroes[i] = new Hero(name);
        }
        int N = scan.nextInt();
        Monster[] monster = new Monster[N];
        boolean[] alive = new boolean[N];
        for(int i=0;i<N;i++){
        int level = scan.nextInt();
        int score = scan.nextInt();
        monster[i] = new Monster(Integer.toString(i+1), level , score);
        }
        int K = scan.nextInt();
        for(int i=0;i<K;i++){
        int iHero = scan.nextInt()-1;
        int iMonster = scan.nextInt()-1;
        if (!alive[iMonster]){
            heroes[iHero].hit(monster[iMonster]);
            alive[iMonster] = !alive[iMonster];
        }
        }
        for(int i=0;i<M;i++){
        heroes[i].stat();
        }
    }
}

