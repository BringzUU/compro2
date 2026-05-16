import java.util.Scanner;

class Bus3 {
    public String name;
    public String type;
    public int sit;
    private int nowseat = 0;
    public String BUS = "Active";

    Bus3(String name, int numtype, int sit) {
        this.name = name;
        if (numtype == 1) {
            this.type = "Fan";
        } else if (numtype == 2) {
            this.type = "P1";
        } else if (numtype == 3) {
            this.type = "VIP";
        }
        this.sit = sit;
    }

    void reserve(int seat) {
        if (seat + this.nowseat > this.sit || seat <= 0 || this.BUS == "Inactive") {
            System.out.println("sorry");
        } else {
            this.nowseat += seat;
            System.out.println(this.name);
        }
    }

    void sendToRepair() {
        this.BUS = "Inactive";
    }

    void backToService() {
        this.BUS = "Active";
    }
}

public class BusCompany3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] type1 =new int[N];
        int[] type2 =new int[N];
        int[] type3 =new int[N];
        int count1 =0;
        int count2 =0;
        int count3 =0;
        Bus3[] b = new Bus3[N];
        for (int i = 0; i < N; i++) {
            String id = sc.next();
            int type = sc.nextInt();
            int seats = sc.nextInt();
            b[i] = new Bus3(id, type, seats);
            if (type==1) {
                type1[count1] = i;
                count1++;
            }
            else if (type==2) {
                type2[count2] = i;
                count2++;
            }
            else if (type==3) {
                type3[count3] = i;
                count3++;
            }
        }
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            int P = sc.nextInt();
            int K = sc.nextInt();
            int T = sc.nextInt();
            if (P == 1) {
                if (T==1) {
                    
                }
                else if (T==2) {
                    
                }
                else if (T==3) {
                    
                }

            } else if (P == 2) {
                b[T - 1].sendToRepair();
            } else if (P == 3) {
                b[T - 1].backToService();
            }
        }
    }
}
