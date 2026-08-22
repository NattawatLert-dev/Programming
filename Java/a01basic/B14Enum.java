package a01basic;

enum Color{
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    // การสร้าง Attribute ใน enum
    private String hex;

    private Color(String hex){
        this.hex = hex;
    }

    public String getHex(){
        return hex;
    }

    // สร้าง method
    public void showInfo() {
        System.out.println(name() + " Color = " + hex);
    }

}

public class B14Enum {
    public static void main(String[] args) {
        
        // enum (Enumeration) = ชนิดข้อมูล (Data Type) ที่ใช้เก็บ "ค่าที่มีจำนวนจำกัด"

        Color color = Color.RED;
        System.out.println(color);
        System.out.println(color.getHex());
        Color.BLUE.showInfo();

        //เข้าถึงสมาชิกทุกตัว
        Color[] colors = Color.values(); // 
        for (Color list : colors) {
            System.out.println(list);
        }

    }
}
//|   เมธอด     |   คืนค่า   | ใช้ทำอะไร           |
//| ----------- | -------- | ------------------ |
//| `values()`  | `Enum[]` | ดึงสมาชิกทั้งหมด      |
//| `valueOf()` | `Enum`   | แปลง String → enum |
//| `name()`    | `String` | คืนชื่อของ enum      |
//| `ordinal()` | `int`    | คืนลำดับของ enum     |

