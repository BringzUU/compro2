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
public class ProductStore {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int N = scan.nextInt();
 Product[] p =new Product[N];
 for(int i = 0; i < N; ++i) {
 scan.nextLine();
 String name = scan.nextLine();
 String sku = scan.nextLine();
 double prices = scan.nextDouble();
 int weight = scan.nextInt();
p[i]=new Product(name, sku, prices, weight);
 }

 for(int i = 0; i < N; ++i) {
boolean valid = p[i].checkValidity();
 System.out.println(valid);
 }


 for(int i = 0; i < N; ++i) {
p[i].printInfo();;
 }
 }
}