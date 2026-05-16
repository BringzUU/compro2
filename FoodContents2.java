import java.util.Scanner;

class Food1 {
public String foodname;
public String[] ingredint;
public int wei;
public int cal;
int conut =0;

public Food1(String foodname,String ingredint,int wei,int cal) {
    this.foodname =foodname;
    this.ingredint = new String[3];
    this.ingredint[conut] =ingredint;
    this.wei =wei;
    this.cal = cal*wei;
    conut++;
}
public void addContent(String ingredint2,int wei2,int cal2){
    this.ingredint[conut] =ingredint2;
    this.wei+=wei2;
    this.cal +=cal2*wei2;
    conut++;
}

public void printInfo(){
    System.out.println(this.foodname);
    System.out.print(this.wei+" ");
    System.out.println(this.cal);
    for(int i=0;i<conut;i++){
        System.out.print(this.ingredint[i]+" ");
    }
    System.out.println();
}
	}


public class FoodContents2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String foodname =sc.next();
        String ingredint =sc.next();
        int wei =sc.nextInt();
        int cal =sc.nextInt();

        Food1 nigga =new Food1(foodname, ingredint, wei, cal);
        for(;;){
            int x =sc.nextInt();
            if (x==0) {
                break;
            }
            if (x==1) {
                nigga.printInfo();
            }
            else{
                String ingredint2 =sc.next();
            int wei2 =sc.nextInt();
            int cal2 =sc.nextInt();
            nigga.addContent(ingredint2, wei2, cal2);}
        }
		}
	}

