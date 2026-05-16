import java.util.Scanner;
class Bus1 {
    public String name;
    public String type;
    public int sit;
    public int nowseat =0;
    Bus1(String name,int numtype,int sit){
        this.name =name;
        if (numtype==1) {
            this.type ="Fan";
        }
        else if (numtype==2) {
            this.type ="P1";
        }
        else if (numtype==3) {
            this.type ="VIP";
        }
        this.sit =sit;
    }

    void printStats(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.nowseat+" "+this.sit);
        System.out.println("Active");
    }
}

public class BusCompany1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String id = scan.next();
    int type = scan.nextInt();
    int seats = scan.nextInt();
    Bus1 b = new Bus1(id, type, seats);
    b.printStats();
    }
}
