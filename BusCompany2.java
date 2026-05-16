import java.util.Scanner;
class Bus2 {
    public String name;
    public String type;
    public int sit;
    public int nowseat =0;
    public String BUS ="Active";
    Bus2(String name,int numtype,int sit){
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

void reserve(int seat){
    if (seat+this.nowseat>this.sit||seat<0||this.BUS=="Inactive") {
        
    }
    else{
        this.nowseat +=seat;
    }
}
void sendToRepair(){
    this.BUS ="Inactive";
}
void backToService(){
    this.BUS ="Active";
}

    void printStats(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.nowseat+" "+this.sit);
        System.out.println(this.BUS);
    }
}
public class BusCompany2 {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 String id = scan.next();
 int type = scan.nextInt();
 int seats = scan.nextInt();
 Bus2 b = new Bus2(id, type, seats);

 int N = scan.nextInt();
 for(int i = 0; i < N; ++i) {
 int P = scan.nextInt();
 int K = scan.nextInt();
 if(P == 1)
 b.reserve(K);
 else if(P == 2)
 b.sendToRepair();
 else if(P == 3)
 b.backToService();
 b.printStats();
 }
 }
}
