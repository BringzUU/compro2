import java.util.Scanner;

class Party {
    public String partyname;
    public int num;
    public String[] first;
    public String[] last;
    public int[] Number;

    Party(String partyname, int num, Scanner sc) {
        this.partyname = partyname;
        this.num = num;
        first = new String[num];
        last = new String[num];
        Number = new int[num];
        for (int i = 0; i < num; i++) {
            first[i] = sc.next();
            last[i] = sc.next();
            Number[i] = sc.nextInt();
        }
    }

    void printInfo(int regionNumber) {
        if (regionNumber == 0) {
            for (int i = 0; i < num; i++) {
                System.out.println(first[i] + " " + last[i] + " " + Number[i]);
            }
        } else if (regionNumber < 0) {
            System.out.println("invalid region number");
        } else {
            boolean check = false;
            for (int i = 0; i < num; i++) {
                if (regionNumber == Number[i]) {
                    System.out.println(first[i] + " " + last[i]);
                    check = true;
                }

            }
            if (!check) {
                System.out.println("none");
            }

        }
    }
}

public class KorKorTor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Party[] party = new Party[N];
        String[] partyname = new String[N];
        int[] number = new int[N];

        for (int i = 0; i < N; i++) {
            partyname[i] = scan.next();
            number[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            party[i] = new Party(partyname[i], number[i], scan);
        }

        final int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            int partyNumber = scan.nextInt();
            int regionNumber = scan.nextInt();
            party[partyNumber - 1].printInfo(regionNumber);
        }
    }

}
