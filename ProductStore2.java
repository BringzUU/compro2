import java.util.Scanner;
class Product {
    String name;
    String sku;
    double prices;
    int weight;
    boolean valid;
    Product(String name,String sku,double prices,int weight){
    this.name=name;
    this.sku=sku;
    this.prices=prices;
    this.weight=weight;
    }

    boolean checkValidity(){
        if (name==null||name.length()==0||sku==null||sku.length()==0||prices<0||weight<0) {
            if (name==null||name.length()==0) {
                System.out.println("name is invalid");
            }
            if (sku==null||sku.length()==0) {
                System.out.println("sku is invalid");
            }
            if (prices<0) {
                System.out.println("price is invalid");
            }
            if (weight<0) {
                System.out.println("weight is invalid");
            }
            valid =false;
            return valid;
        }
        else{
            valid =true;
            return valid;
        }
    }

    void printInfo(){
        if (this.valid){
            System.out.println(name+", "+sku+", "+prices+", "+weight);
        }
        else{
            
            System.out.println(name+", "+sku+", "+prices+", "+weight+", "+"Invalid");
        }
        
    }
}
class Shoe extends Product {
    int gender;
int size;
int type;
String brand;
    Shoe(String name,String sku,double prices,int weight,int gender,int size,int type,String brand){
        super(name, sku, prices, weight);
        this.gender=gender;
        this.size=size;
        this.type=type;
        this.brand=brand;
    }
void printInfo(){
    super.printInfo();
if (gender==1) {
    System.out.print("female, ");
}
else{
    System.out.print("male, ");
}
System.out.print(size+", ");
if (type==1) {
    System.out.print("sport, ");
}
else if (type==2) {
    System.out.print("formal, ");
}
else{
    System.out.print("casual, ");
}
System.out.println(brand);
}
}
public class ProductStore2 {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int N = scan.nextInt();
 Shoe[] s =new Shoe[N];
 for(int i = 0; i < N; ++i) {
 scan.nextLine(); // throw away new-line char
 String name = scan.nextLine();
 String sku = scan.nextLine();
 double prices = scan.nextDouble();
 int weight = scan.nextInt();
 int gender = scan.nextInt();
 int size = scan.nextInt();
 int type = scan.nextInt();
 String brand = scan.next();
s[i] =new Shoe(name, sku, prices, weight, gender, size, type, brand);
 }

 // Call checkVaidity of each product object.
 for(int i = 0; i < N; ++i) {
 boolean valid =s[i].checkValidity();
 System.out.println(valid);
 }

 // Call printInfo of each product object.
 for(int i = 0; i < N; ++i) {
s[i].printInfo();
 }
         scan.close();

 }
}