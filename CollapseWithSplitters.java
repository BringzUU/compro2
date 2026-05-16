import java.util.*;

public class CollapseWithSplitters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับขนาดอาเรย์
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // รับค่ากั้นแบ่ง 3 ค่า
        Set<Integer> splitters = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            splitters.add(sc.nextInt());
        }

        // สร้างลิสต์เก็บผลลัพธ์
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        boolean inSegment = false;
        boolean lastWasSplitter = false;

        for (int i = 0; i < n; i++) {
            int val = array[i];

            if (splitters.contains(val)) {
                if (inSegment) {
                    // ถ้ากำลังสะสมค่า ให้เพิ่มผลรวมเข้า result
                    result.add(sum);
                    sum = 0;
                    inSegment = false;
                }

                if (!lastWasSplitter) {
                    result.add(val); // เพิ่ม splitter ถ้ายังไม่ได้เพิ่มซ้ำ
                    lastWasSplitter = true;
                }

            } else {
                // ถ้าไม่ใช่ splitter ให้สะสมค่าบวก
                sum += val;
                inSegment = true;
                lastWasSplitter = false;
            }
        }

        // ถ้ามีค่าค้างให้ใส่ลงในผลลัพธ์
        if (inSegment) {
            result.add(sum);
        }

        // แสดงผลลัพธ์
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
