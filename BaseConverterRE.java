import java.util.Scanner;

public class BaseConverterRE {

    String convertBase(int decimal, int base) {

        // ===== Base Case =====
        // ถ้าค่า decimal น้อยกว่าฐาน
        // แสดงว่าไม่ต้องหารต่อแล้ว
        if (decimal < base) {

            // ถ้าค่าน้อยกว่า 10
            // ใช้ตัวเลขปกติได้เลย
            if (decimal < 10)
                return String.valueOf(decimal);

            // ถ้าค่ามากกว่าหรือเท่ากับ 10
            // เปลี่ยนเป็น A, B, C ...
            else
                return String.valueOf((char) ('A' + decimal - 10));
        }

        // ===== Recursive Case =====

        // หาเศษจากการหารด้วยฐาน
        int remainder = decimal % base;

        // ใช้เก็บค่าของหลักปัจจุบัน
        String digit;

        // ถ้าเศษน้อยกว่า 10
        // ใช้ตัวเลขปกติ
        if (remainder < 10)
            digit = String.valueOf(remainder);

        // ถ้าเศษมากกว่าหรือเท่ากับ 10
        // เปลี่ยนเป็น A, B, C ...
        else
            digit = String.valueOf((char) ('A' + remainder - 10));

        // เรียกฟังก์ชันซ้ำ
        // decimal / base คือค่าที่จะใช้ในรอบถัดไป
        // แล้วนำ digit มาต่อท้าย
        return convertBase(decimal / base, base) + digit;
    }

    public static void main(String[] args) {

        // ใช้รับค่าจากผู้ใช้
        Scanner sc = new Scanner(System.in);

        // สร้าง object ของคลาส BaseConverter
        BaseConverter bc = new BaseConverter();

        // รับเลขฐานสิบ
        int decimal = sc.nextInt();

        // รับฐานที่ต้องการแปลง
        int base = sc.nextInt();

        // เรียกใช้ฟังก์ชันแปลงเลขฐาน
        String result = bc.convertBase(decimal, base);

        // แสดงผลลัพธ์
        System.out.println(result);
        sc.close();
    }
}