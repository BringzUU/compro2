import java.util.Scanner;

// คลาสสำหรับจัดการสมุดรายชื่อ
class ContactBook {

    // Array เก็บชื่อ
    private String[] names;

    // Array เก็บเบอร์โทร
    private String[] numbers;

    // Constructor รับชื่อและเบอร์เข้ามาเก็บ
    public ContactBook(String[] names, String[] numbers) {

        // this.names คือ array ของ object
        // names คือ array ที่รับเข้ามา
        this.names = names;

        // เก็บเบอร์โทรเข้า object
        this.numbers = numbers;
    }

    // เมธอดแสดงรายชื่อทั้งหมด
    public void getAllContact() {

        // วนลูปทุกตำแหน่งใน array
        for (int i = 0; i < names.length; i++) {

            // แสดงชื่อและเบอร์
            System.out.println(names[i] + " " + numbers[i]);
        }
    }

    // เมธอดค้นหาเบอร์โทรจากชื่อ
    public void getContact(String name) {

        // วนลูปค้นหาชื่อ
        for (int i = 0; i < names.length; i++) {

            // equals() ใช้เปรียบเทียบ String
            if (names[i].equals(name)) {

                // ถ้าเจอชื่อให้แสดงเบอร์
                System.out.println(numbers[i]);

                // จบการทำงานทันที
                return;
            }
        }

        // ถ้าไม่เจอชื่อ
        System.out.println("Invalid contact");
    }

    // เมธอดตรวจสอบว่าเป็นตัวเลขทั้งหมดหรือไม่
    public static boolean onlyDigits(String number) {

        // วนตรวจทุกตัวอักษร
        for (int i = 0; i < number.length(); i++) {

            // charAt(i) คือดึงตัวอักษรตำแหน่ง i
            // isDigit() เช็คว่าเป็นตัวเลขไหม
            if (!Character.isDigit(number.charAt(i))) {

                // ถ้าไม่ใช่ตัวเลข
                return false;
            }
        }

        // ถ้าเป็นตัวเลขทั้งหมด
        return true;
    }

    // เมธอดแก้ไขเบอร์โทร
    public void editNumber(String name, String newNumber) {

        // ตรวจสอบรูปแบบเบอร์
        // 1. ต้องเป็นตัวเลขทั้งหมด
        // 2. ต้องขึ้นต้นด้วย 0
        // 3. ความยาว 9-10 หลัก
        if (!onlyDigits(newNumber) ||
                !newNumber.startsWith("0") ||
                newNumber.length() < 9 ||
                newNumber.length() > 10) {

            // ถ้าไม่ถูกต้อง
            System.out.println("Invalid number");

            // จบการทำงาน
            return;
        }

        // วนลูปค้นหาชื่อ
        for (int i = 0; i < names.length; i++) {

            // ถ้าเจอชื่อ
            if (names[i].equals(name)) {

                // เปลี่ยนเบอร์ใหม่
                numbers[i] = newNumber;

                // แสดงผลว่าแก้ไขสำเร็จ
                System.out.println(name +
                        " new number is " +
                        newNumber);

                // จบการทำงาน
                return;
            }
        }

        // ถ้าไม่พบชื่อ
        System.out.println("Invalid contact");
    }
}

// คลาสหลัก
public class ContactManagerhard {

    public static void main(String[] args) {

        // Scanner สำหรับรับข้อมูล
        Scanner sc = new Scanner(System.in);

        // รับจำนวนรายชื่อ
        int N = sc.nextInt();

        // สร้าง array เก็บชื่อ
        String[] names = new String[N];

        // สร้าง array เก็บเบอร์
        String[] numbers = new String[N];

        // รับข้อมูลชื่อและเบอร์
        for (int i = 0; i < N; i++) {

            // รับชื่อ
            names[i] = sc.next();

            // รับเบอร์
            numbers[i] = sc.next();
        }

        // สร้าง object ContactBook
        ContactBook book = new ContactBook(names, numbers);

        // รับจำนวนคำสั่ง
        int K = sc.nextInt();

        // วนทำคำสั่ง K รอบ
        for (int i = 0; i < K; i++) {

            // รับเลขคำสั่ง
            int command = sc.nextInt();

            // ===== คำสั่งค้นหา =====
            if (command == 1) {

                // รับชื่อ
                String name = sc.next();

                // เรียกเมธอดค้นหา
                book.getContact(name);
            }

            // ===== คำสั่งแก้ไข =====
            else if (command == 2) {

                // รับชื่อ
                String name = sc.next();

                // รับเบอร์ใหม่
                String newNumber = sc.next();

                // เรียกเมธอดแก้ไข
                book.editNumber(name, newNumber);
            }

            // ===== คำสั่งแสดงทั้งหมด =====
            else if (command == 3) {

                // เรียกเมธอดแสดงทั้งหมด
                book.getAllContact();
            }

            // ===== คำสั่งไม่ถูกต้อง =====
            else {

                System.out.println("Invalid command");
            }
        }

        sc.close();
    }
}