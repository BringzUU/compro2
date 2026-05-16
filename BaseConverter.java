import java.util.Scanner;

public class BaseConverter {
String convertBase(int decimal, int base) {
                String output = Integer.toString(decimal, base); //ใช้สูตรInteger.toStringเพื่อแปลงค่าเป็นเลขฐานได้ทันที
            return output; //ส่งกลับไปที่เก่า
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseConverter bc = new BaseConverter(); //สร้างตัวออปเจ็กขึ้นมา อันนี้เป็นแบบสั้น
        int decimal = sc.nextInt(); //รับเลขฐาน10
        int base = sc.nextInt(); //รับฐานที่จะใช้แปลงเลข
        String result = bc.convertBase(decimal, base); //ส่งเลขฐาน10และฐานที่จะใช้แปลงเข้าไป
        System.out.println(result);
        sc.close();
    }
}