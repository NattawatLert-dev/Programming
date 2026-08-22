package a01basic;

public class B13Math {
    public static void main(String[] args) {
        
        // Math เป็นคลาสที่มีเมธอดสำหรับคำนวณทางคณิตศาสตร์ โดยไม่ต้องสร้างอ็อบเจ็กต์

        // PI
        System.out.println(Math.PI);

        // E
        System.out.println(Math.E);

        // ค่าสัมบูรณ์ (Absolute)
        System.out.println(Math.abs(-10));

        // หาค่าสูงสุด
        System.out.println(Math.max(5,8));

        // หาค่าต่ำสุด
        System.out.println(Math.min(5,8));

        // ยกกำลัง
        System.out.println(Math.pow(2,3));

        // รากที่สอง
        System.out.println(Math.sqrt(64));

        // Math.round() ปัดตามหลักคณิตศาสตร์
        System.out.println(Math.round(4.6));

        // Math.ceil() ปัดขึ้นเสมอ
        System.out.println(Math.ceil(4.1));

        // Math.floor() ปัดลงเสมอ
        System.out.println(Math.floor(4.9));

        // ตรีโกณมิติ ใช้หน่วย เรเดียน
        System.out.println(Math.sin(Math.PI / 2));

        // องศา → เรเดียน
        double r = Math.toRadians(180);
        
        System.out.println(r);

        // เรเดียน → องศา
        double d = Math.toDegrees(Math.PI);

        System.out.println(d);

        // ลอการิทึม
        System.out.println(Math.log(Math.E));

        

    }
}
