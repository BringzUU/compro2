import java.util.Scanner;

class BackAccount3{
    int balance;
    BackAccount3(){
        this.balance =10_000;
    }

    int Deposit(int deposit){
        this.balance +=deposit;
        return this.balance;
    }
    
}

public class Account3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int deposit = sc.nextInt();
        BackAccount3 B =new BackAccount3();
        if (deposit<=0) {
            System.out.println("Error");    
        }
        else{
            System.out.println(B.Deposit(deposit));
        }
        sc.close();
    }
}
