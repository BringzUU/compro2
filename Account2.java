import java.util.Scanner;

class BackAccount2{
    int balance;
    BackAccount2(){
        this.balance =10_000;
    }

    int Deposit(int deposit){
        this.balance +=deposit;
        return this.balance;
    }
    
}

public class Account2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        BackAccount2 B =new BackAccount2();
        int deposit = sc.nextInt();
        System.out.println(B.Deposit(deposit));
        sc.close();
    }
}
