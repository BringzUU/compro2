import java.util.Scanner;
class Theater {
    boolean threeD;
    boolean luxury;
    int numSeats;
    String title;
    int basePrice;
    Theater(boolean threeD,boolean luxury,int numSeats){
        this.threeD =threeD;
        this.luxury =luxury;
        this.numSeats =numSeats;
    }
    void setTitle(String title){
        if (title==null||title.length()<=0) {
            System.out.println("invalid title");
        }
            this.title = title;
    }
    void setBasePrice(int basePrice){
        if (basePrice<=0) {
            System.out.println("invalid price");
        }
            this.basePrice =basePrice;
    }

    int reserveOne(int seatNumber){
        return 0;
    }



    void printInfo(){
        if (this.threeD) {
            System.out.println("3D");
        }
        else{
            System.out.println("No 3D");
        }
        if (this.luxury) {
            System.out.println("Luxury");
        }
        else{
            System.out.println("Standard");
        }
        System.out.println(numSeats);
        if (this.title==null||title.length()<=0) {
            System.out.println("title is not set");
        }
        else{
            System.out.println(this.title);
        }
        if (basePrice<=0) {
            System.out.println("price is not set");
        }
        else{
            System.out.println(this.basePrice);
        }
    }
}
// Do not modify the code below. You must leave it as is.
public class Theater2 {
public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int threeD1 = scan.nextInt();
 int luxury1 = scan.nextInt();
 int numSeats = scan.nextInt();
 boolean threeD = false;
 boolean luxury = false;
 if(threeD1 == 1)
 threeD = true;
 if(luxury1 == 1)
 luxury = true;
 Theater t = new Theater(threeD, luxury, numSeats);

 String dummy = scan.nextLine(); // throw away new line character
 String title = scan.nextLine();
 t.setTitle(title);

 int basePrice = scan.nextInt();
 t.setBasePrice(basePrice);

 int N = scan.nextInt();
 for(int i = 0; i < N; ++i) {
 int numberOfSeats = scan.nextInt();
 int seatNumber = scan.nextInt();
 int totalPrice;
 if(numberOfSeats == 1)
 totalPrice = t.reserveOne(seatNumber);
 else
 totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
 if(totalPrice > 0)
 System.out.println(totalPrice);
 }

 t.printInfo();
 scan.close();
 }
}