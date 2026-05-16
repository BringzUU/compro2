
import java.util.Scanner;
class CPU{
public String model;
public int clocks;
public int  socket;
public int memType;
public boolean valid;
    CPU(String model,int clocks,int  socket,int memType){
        this.model =model;
        this.clocks =clocks;
        this.socket =socket;
        this.memType =memType;
        this.valid = isValidSpec();
    }

    boolean isValidSpec() {
        boolean Spec;
        if (this.model==null||this.model.length()==0||this.clocks<=0||this.socket<=0||this.memType<=0||this.memType>10) {
            Spec = false;
        }
        else{
            Spec = true;
        }
        return Spec;
    }
 
    void printInfo(){
        System.out.println(this.model);
        System.out.println(this.clocks);
        System.out.println(this.socket);
        System.out.println(this.memType);
        System.out.println(this.valid);
    }

}

class MainBoard{
    public String model;
    public int clocks;
    public int  socket;
    public int memType;
    public boolean valid;
        MainBoard(String model,int  socket,int memType){
            this.model =model;
            this.socket =socket;
            this.memType =memType;
            this.valid = isValidSpec(model,socket,memType);
        }
    
        boolean isValidSpec(String model,int  socket,int memType) {
            boolean Spec;
            if (this.model==null||this.model.length()==0||this.socket<=0||this.memType<=0||this.memType>10) {
                Spec = false;
            }
            else{
                Spec = true;
            }
            return Spec;
        }
        void printInfo(){
            System.out.println(this.model);
            System.out.println(this.socket);
            System.out.println(this.memType);
            System.out.println(this.valid);
        }
}

class Computer{
    boolean valid;
    CPU cpu;
    MainBoard mb;
    Computer(CPU cpu,MainBoard mb){
        this.cpu =cpu;
        this.mb =mb;
        this.valid =isValidCom(cpu,mb);
    }
    boolean isValidCom(CPU cpu,MainBoard mb){
        if (cpu.socket==mb.socket&&cpu.memType==mb.memType&&mb.valid==true&&cpu.valid==true) {
            return true;
        }
        else{
            return false;
        }
    }
    void printInfo(){
        if (valid) {
            System.out.println(cpu.model);
        System.out.println(cpu.clocks);
        System.out.println(mb.model);
        System.out.println(cpu.socket);
        System.out.println(cpu.memType);
        }
        else{
            System.out.println("Invalid Spec");
            cpu.printInfo();
            mb.printInfo();
        }
    }
}

public class MBCompat {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String model =scan.nextLine();
        int clocks =scan.nextInt();
        int  socket =scan.nextInt();
        int memType =scan.nextInt();

        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
            
        }
        CPU cpu =new CPU(model,clocks,socket,memType);
        scan.nextLine();

        model =scan.nextLine();
        socket =scan.nextInt();
        memType =scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        MainBoard mb = new MainBoard(model,socket,memType);
        Computer com = new Computer(cpu,mb);
            com.printInfo();
                    scan.close();

    }
}
