import java.util.Scanner;
public class RemoveAnyDup {
    String removeAnyDup(String str) {
    String word;
    String left;
    int n= str.length();
    System.out.println(str.substring(0, n));
    word ="Line";
    if (word.length()>0) {
        str =str.substring(0,n-1);
        removeAnyDup(str);
    }
        return word;
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    RemoveAnyDup remover = new RemoveAnyDup ();
    String result = remover.removeAnyDup(str);
    System.out.print(result);
    }
}