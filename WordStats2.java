import java.util.Scanner;

public class WordStats2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        sc.nextLine();//FLUSH 
        int[] Min=new int[26];
        int[] Max=new int[26];
        for(int j=0;j<N;j++){
            String W =sc.nextLine();
            int index = W.charAt(0)-65;
            int len =W.length();
            
            if (Min[index]==0||Min[index]>len) {
                Min[index] =len;
            }
            if (Max[index]<len) {
                Max[index] =len;
            }
        }
    
        for(int i=0;i<Min.length;i++){
            if (Min[i]>0) {
                System.out.println((char)(i+65)+" "+Min[i]+" "+Max[i]);
            }
        }
    }
}
