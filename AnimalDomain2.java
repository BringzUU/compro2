import java.util.Scanner;

class Animal2 {
    String name;
    int type;
    int age;
    int vac;
    int lifeExpect;

    Animal2(String name,int lifeExpect) {
        this.name = name;
        this.lifeExpect =lifeExpect;
        this.age = 0;
        this.vac = 0;
        System.out.println(this.name + " was born with life expectancy " + this.lifeExpect + " year(s)");
    }

    void live(int year) {
        if (this.age + year < this.lifeExpect) {
            this.age += year;
            if (year==1) {
                System.out.println(this.name + " lived " + year + " more year");
            }
            else{
                System.out.println(this.name + " lived " + year + " more years");
            }

        } else {
            if (this.age>=lifeExpect) {
                System.out.println(this.name + " died earlier");
            }
            else if ((this.age-this.lifeExpect)*-1 == 1) {
                System.out.println(this.name + " lived " + ((this.age-this.lifeExpect)*-1) + " more year and died");
            } else {
                System.out.println(this.name + " lived " + ((this.age-this.lifeExpect)*-1) + " more years and died");
            }
            this.age=this.lifeExpect;
        }
    }

    void vaccine(){
        System.out.println(this.name + "'s life expectancy is now " + (this.lifeExpect) + " year(s)");
    }

    boolean isAlive() {
        if (this.age < this.lifeExpect) {
            System.out.println(this.name + " is alive");
            return true;
        } else {
            System.out.println(this.name + " is dead");
            return false;
        }
    }
}

class Dog extends Animal2{
    int vac ;
    Dog(String name){
        super(name,8);
    }
    void vaccine(){
            if (vac==0&&this.age<this.lifeExpect) {
                this.lifeExpect = this.age+(this.lifeExpect-this.age)*2;
            vac++;
        }
        super.vaccine();
    }
}
class Turtle extends Animal2{
    Turtle(String name){
        super(name,50);
    }
}
class Salmon extends Animal2{
    Salmon(String name){
        super(name,4);
    }
}

public class AnimalDomain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int life =0;
        Animal2[] a =new Animal2[N];
        for (int i = 0; i < N; ++i) {
            int event = scan.nextInt();
            if (event == 1) {
                int type = scan.nextInt();
                String name = scan.next();
                if(type==1)
                a[life] =new Dog(name);
                else if (type==2) {
                    a[life] =new Turtle(name);
                }
                else if (type==3) {
                    a[life] =new Salmon(name);
                }
                life++;
            } else if (event == 2) {
                int id = scan.nextInt() - 1;
                int year = scan.nextInt();
                a[id].live(year);
            } else if (event == 3) {
                int id = scan.nextInt() - 1;
                a[id].isAlive();
            }
            else if (event==4) {
                int id = scan.nextInt() - 1;
                a[id].vaccine();
            }
        }
        scan.close();
    }
}