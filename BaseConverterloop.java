import java.util.Scanner;

public class BaseConverterloop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับเลขฐานสิบ
        int decimal = sc.nextInt();

        // รับฐานที่ต้องการแปลง
        int base = sc.nextInt();

        // ถ้าค่าเป็น 0
        if (decimal == 0) {
            System.out.println("0");
            return;
        }

        // เก็บผลลัพธ์
        String result = "";

        // วนลูปแปลงเลขฐาน
        while (decimal > 0) {

            // หาเศษ
            int remainder = decimal % base;

            // ถ้าเศษน้อยกว่า 10
            if (remainder < 10) {
                result = remainder + result;
            }

            // ถ้าเศษ >= 10 ให้แปลงเป็น A, B, C...
            else {
                result = (char)('A' + remainder - 10) + result;
            }

            // ลดค่า decimal
            decimal = decimal / base;
        }

        // แสดงผล
        System.out.println(result);

        sc.close();
    }
}