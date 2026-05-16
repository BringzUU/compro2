import java.util.Scanner;

class LectRoom {
public int classCode;
public String name;
public int capacity;
public int currentSeats;
    LectRoom(int classCode,String name,int capacity){
        this.classCode =classCode;
        this.name = name;
        this.capacity =capacity;
        this.currentSeats =0;
    }
    
    boolean reserveSeats(int seat) {
        if (seat+currentSeats<=capacity) {
            currentSeats +=seat;
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return classCode+" "+name+" "+capacity;
    }
}

public class LectureRoom1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int K =sc.nextInt();
        LectRoom[] lectroom =new LectRoom[K];
        for(int i=0;i<K;i++){
        int classCode = sc.nextInt();
        String name =sc.next();
        int capacity =sc.nextInt();
        lectroom[i] =new LectRoom(classCode,name,capacity);
        }
        for(int i=0;i<3;i++){
            int A =sc.nextInt()-1;
        System.out.println(lectroom[A]);
        }
        
        
        
    }
}
