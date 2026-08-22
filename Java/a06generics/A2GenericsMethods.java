package a06generics;

public class A2GenericsMethods {
    public static void main(String[] args) {

        // 1.
        printData(100);
        printData("Hello");

        // 2.
        Integer num = getValue(100);
        String word = getValue("Good");

        System.out.println(num);
        System.out.println(word);
        
    }

    // สร้าง methods ปกติ
    public static <T> void printData(T data){
        System.out.println(data);
    }

    // Methods แบบมี Return Type
    public static <T> T getValue(T value) {
        return value;
    }
}
