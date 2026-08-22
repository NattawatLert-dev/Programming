package a06generics;

class Pair<T, U>{

    private T key;
    private U value;

    public Pair(T key, U value){
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public U getValue() {
        return value;
    }
}

public class A3MultipleType {
    public static void main(String[] args) {
        Pair<String , Integer> student = new Pair<>("Hello", 100);

        System.out.println(student.getKey());
        System.out.println(student.getValue());
    }
}
