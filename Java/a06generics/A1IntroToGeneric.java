package a06generics;

class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


public class A1IntroToGeneric {
    public static void main(String[] args) {
        
        // Generic = ความสามารถที่ทำให้เราสามารถเขียนโค้ดที่ใช้กับข้อมูลได้หลายชนิด (Type) 
        //           โดยยังคง Type Safety (ตรวจสอบชนิดข้อมูลตั้งแต่ตอน Compile) และลดการเขียนโค้ดซ้ำ

        Box<String> language = new Box<>("Java");
        Box<Integer> age = new Box<>(20);

        System.out.println(language.getValue());
        System.out.println(age.getValue());

        language.setValue("Python");

        System.out.println(language.getValue());

    }
}
// Wrapper class
//| Primitive Type | Wrapper Class |
//| -------------- | ------------- |
//| `byte`         | `Byte`        |
//| `short`        | `Short`       |
//| `int`          | `Integer`     |
//| `long`         | `Long`        |
//| `float`        | `Float`       |
//| `double`       | `Double`      |
//| `char`         | `Character`   |
//| `boolean`      | `Boolean`     |
