import java.util.Scanner;

class Dept {
    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    int salary;
    int elec;
    int eduCost;
    int income =0;
    int expense =0;
Dept(int staff,int student){
    this.income =this.computeIncome(staff,student);
    this.expense = this.computeExpense(staff,student);
    int sum =income-expense;
    System.out.println("total income = "+this.income);
        System.out.println("total expense = "+this.expense);
        System.out.println("income - expense = "+sum);
}

    int computeIncome(int staff,int student){
        this.ministryBudget =(staff*500000)+(student*3000);
        this.eduFee =student*5000;
        this.serviceFee =300000;
        this.donation =100000;
        int sum =ministryBudget+eduFee+serviceFee+donation;
        return sum;
    }

    int  computeExpense(int staff,int student){
this.salary = staff *600000;
this.elec =(staff+student)*2000;
this.eduCost =student*4000;
int sum =salary+elec+eduCost;
return sum;
    }

    void printReport(){
        System.out.println("ministry budget = "+this.ministryBudget);
        System.out.println("education fee = "+this.eduFee);
        System.out.println("service fee = "+this.serviceFee);
        System.out.println("donation = "+this.donation);
System.out.println("salary = "+this.salary);
System.out.println("electricity = "+this.elec);
System.out.println("educational cost = "+this.eduCost);
    }
}

public class Department2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        int K =sc.nextInt();

        Dept d =new Dept(N,K);
        d.printReport();
        sc.close();
    }
}
