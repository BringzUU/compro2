import java.util.Scanner;

class Animal {
    String name;
    int lifeExpect;
    int age;

    Animal(String name, int lifeExpect) {
        this.name = name;
        this.lifeExpect = lifeExpect;
        this.age = 0;
        System.out.println(this.name + " was born with life expectancy " + this.lifeExpect + " year(s)");
    }

    void live(int year) {
        if (this.age + year < this.lifeExpect) {
            this.age += year;
            if (year == 1) {
                System.out.println(this.name + " lived " + year + " more year");
            } else {
                System.out.println(this.name + " lived " + year + " more years");
            }

        } else {
            if (this.age >= lifeExpect) {
                System.out.println(this.name + " died earlier");
            } else if ((this.age - this.lifeExpect) * -1 == 1) {
                System.out.println(this.name + " lived " + (-(this.age - this.lifeExpect)) + " more year and died");
            } else {
                System.out.println(this.name + " lived " + (-(this.age - this.lifeExpect)) + " more years and died");
            }
            this.age = this.lifeExpect;
        }
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

public class AnimalDomain1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int life = 0;
        Animal[] a = new Animal[N];
        for (int i = 0; i < N; ++i) {
            int type = scan.nextInt();
            if (type == 1) {
                String name = scan.next();
                int lifeExpect = scan.nextInt();
                a[life] = new Animal(name, lifeExpect);
                life++;
            } else if (type == 2) {
                int id = scan.nextInt() - 1;
                int year = scan.nextInt();
                a[id].live(year);
            } else if (type == 3) {
                int id = scan.nextInt() - 1;
                a[id].isAlive();
            }
        }
        scan.close();
    }
}