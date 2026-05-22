import java.util.Scanner;

class House {

    // ตัวแปรระดับคลาส
    public int width;
    public int length;
    public int piggies;

    // Constructor
    public House(int width, int length) {
        this.width = width;
        this.length = length;
        this.piggies = 0;
    }

    // เมธอดแสดงจำนวนหมูและพื้นที่ที่ใช้
    public void printPiggies() {
        System.out.println("Piggies " + piggies + ", Space " + (piggies * 9));
    }

    // Static Method
    public static void encourage() {
        System.out.println("Piggy Together STRONG!");
    }
}

public class PiggyHouse {

    public static void main(String[] args) {

        // เรียกใช้เมธอด encourage
        House.encourage();

        Scanner sc = new Scanner(System.in);

        // รับค่าความกว้างและความยาว
        int w = sc.nextInt();
        int l = sc.nextInt();

        // สร้างวัตถุบ้าน
        House house = new House(w, l);

        // พื้นที่ทั้งหมดของบ้าน
        int totalSpace = w * l;

        // รับจำนวนหมูเรื่อย ๆ
        while (sc.hasNextInt()) {

            int K = sc.nextInt();

            // ตรวจสอบว่าพื้นที่พอหรือไม่
            if (9 * (house.piggies + K) <= totalSpace) {

                // เพิ่มจำนวนหมู
                house.piggies += K;

                // แสดงผล
                house.printPiggies();

            } else {

                // พื้นที่ไม่พอ
                System.out.println("no space, need a new house");
                break;
            }
        }

        sc.close();
    }
}