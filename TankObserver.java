public import java.util.Scanner;

class WaterTank {

    // ตัวแปรสมาชิก
    int capacity;
    int volume;

    public WaterTank(int width, int length, int height) {
        capacity = width * length * height;
        volume = 0;
    }

    // เมธอดเติมน้ำ
    public int fill(int amount) {

        // ตรวจสอบว่าน้ำจะล้นหรือไม่
        if (volume + amount > capacity) {
            System.out.println("Cannot fill the tank");
            return -1;
        }

        // เติมน้ำ
        volume += amount;

        // คืนค่าปริมาณน้ำปัจจุบัน
        return volume;
    }
}

public class TankObserver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // รับขนาดถัง
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();

        // สร้างวัตถุ WaterTank
        WaterTank tank = new WaterTank(width, length, height);

        // เติมน้ำ 5 ครั้ง
        for (int i = 0; i < 5; ++i) {

            int amount = scan.nextInt();

            // เรียกเมธอด fill และแสดงผลลัพธ์
            System.out.println(tank.fill(amount));
        }

        scan.close();
    }
} {
    
}
