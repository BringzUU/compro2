import java.util.Scanner;

public class WordStats1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        sc.nextLine();
        int[] array=new int[26];
        for(int j=0;j<N;j++){
            String W =sc.nextLine();
            int index = W.charAt(0)-65;
            array[index]++;
        }
    
        for(int i=0;i<array.length;i++){
            if (array[i]>0) {
                System.out.println((char)(i+65)+" "+array[i]);
            }
        }
    }
}
