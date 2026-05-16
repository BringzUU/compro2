import java.util.Scanner;

class BackAccount1{
    int balance;
    BackAccount1(){
        this.balance =10_000;
    }

    int Deposit(int deposit){
        this.balance +=deposit;
        return this.balance;
    }
    
}

public class Account1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int deposit = sc.nextInt();
        BackAccount1 B =new BackAccount1();
        int sum =B.Deposit(deposit);
        System.out.println(sum);
        sc.close();
    }
}
