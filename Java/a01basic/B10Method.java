package a01basic;

public class B10Method {
    public static void main(String[] args) {
        
        // Methods = กลุ่มของคำสั่งที่รวมกันเพื่อทำงานอย่างใดอย่างหนึ่ง

        // 1.
        hello(); //Hello World

        // 2.
        user("Nattawat", 21); // Hello Nattawat 21

        // 3. 
        System.out.println(sum(10,3)); // 13

        // 4.
        int result = factorial(5);
        System.out.println(result); // 120

        // 5.
        int[] arr = {10, 20, 30, 40};
        System.out.println(linearsearch(arr, 30)); // 2

    }

    // 1. Method แบบไม่มี Parameter และไม่มี Return
    public static void hello(){
        System.out.println("Hello World");
    }

    // 2. Methods ที่มี Parameter  (Parameter = ตัวแปรที่ประกาศไว้ใน Method เพื่อรับข้อมูลที่ส่งเข้ามา , Argument = "ค่าจริง" ที่เราส่งเข้าไปใน Method ตอนเรียกใช้งาน)
    public static void user(String name, int age) {
        System.out.println("Hello " + name + " " + age);
    }

    // 3. Return Type = การส่งค่ากลับจาก Method ไปยังจุดที่เรียกใช้
    public static int sum(int a, int b){
        return a + b;
    }

    // 4. Recursion (Method เรียกตัวเอง) = Recursion คือการที่ Method เรียกตัวเอง
    //                                  Base case → เงื่อนไขหยุด recursion (สำคัญมาก ไม่งั้นจะลูปไม่จบ)
    //                                  Recursive case → เรียกตัวเองพร้อมลดขนาดปัญหา
    public static int factorial(int n) {

        if (n == 1) {   // Base case
            return 1;
        }

        return n * factorial(n - 1); // Recursive case
    }

    // 5. Methods ที่มี Parameter และ Return Type
    public static int linearsearch(int[] arr, int target){


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }
}
