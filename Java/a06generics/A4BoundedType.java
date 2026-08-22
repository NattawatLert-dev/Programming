package a06generics;

class Calculator<T extends Number>{
    
    private T a;
    private T b;
    
    public Calculator(T a, T b){
        this.a = a;
        this.b = b;
    }

    public double sum(){
        return a.doubleValue() + b.doubleValue();
    }
}

public class A4BoundedType {
    public static void main(String[] args) {
        
        // Bounded Type = การกำหนด "ขอบเขต" ของ Generic ว่า Type ที่ส่งเข้ามาต้องเป็นชนิดใดชนิดหนึ่ง หรือสืบทอด (extends) จากชนิดนั้น

        Calculator<Integer> cal = new Calculator<>(10, 14);

        System.out.println(cal.sum());
    }
}

// extends Number = ต้องเป็น Number หรือคลาสลูกของ Number
 