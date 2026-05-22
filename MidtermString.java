import java.util.Scanner;

public class MidtermString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String text = sc.next();
        String tg = sc.next();
        int start=0;
        int tg1;
        int tg2;
        String[] pt = new String[100];
        int p = 0;
        int more = text.indexOf(tg, start);
        int moree = text.indexOf(tg,more+tg.length());
        if (text.indexOf(tg)==-1||more==-1||moree==-1) {
            System.out.println(0);
        }
        else{
        for (;;) {
            tg1 = text.indexOf(tg,start)+tg.length();
            tg2 = text.indexOf(tg, tg1);
            pt[p] = text.substring(tg1,tg2);
            p++;
            start=tg2+tg.length();
            if (start>=text.length()) {
                break;
            }
            more = text.indexOf(tg, start);
            moree = text.indexOf(tg,more+tg.length());
            if(more==-1||moree==-1){
                break;
            }
        }
        System.out.println(p);
        for (int i = 0; i < p; i++) {
            if (pt[i]=="") {
                System.out.println((i+1)+" _");
            }
            else{
            System.out.println((i+1)+" "+pt[i]);
            }
        }
    }
    }
}

/*
assodsossanssssn
ss
2
1 odso
2 _

*/