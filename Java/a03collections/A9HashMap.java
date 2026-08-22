package a03collections;

import java.util.HashMap;

public class A9HashMap {
    public static void main(String[] args) {
        
        // HashMap = Collection ที่ใช้เก็บข้อมูลในรูปแบบ Key → Value

        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("Apple",50);
        map.put("Banana",20);
        map.put("Orange",30);
        
        System.out.println(map.get("Banana")); // 20
    }
}
