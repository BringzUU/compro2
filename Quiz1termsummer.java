import java.util.Scanner;

public class Quiz1termsummer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // เก็บเลข
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            // เช็คขอบเขต
            if(a < 0 || b < 0 || a >= arr.length || b >= arr.length) {
                System.out.println("false");
            } else {

                System.out.println("true");

                // สลับค่า
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;

                // ปริ้นเป็นตัวอักษร
                for(int num : arr) {

                    char ch = (char)(num + 'A');

                    System.out.print(ch + " ");
                }

                System.out.println();
            }
        }
    }
}