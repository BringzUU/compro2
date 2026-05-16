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

public class CPUSpec {
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
            cpu.printInfo();
    }
}
