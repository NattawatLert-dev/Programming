#include <iostream>

void change(int x);

int main(){

    // Pass by Value = ส่งค่าของตัวแปรเข้าไปในฟังก์ชัน โดยฟังก์ชันจะได้รับ "สำเนา (copy)" ของค่าเดิม
    //                 ถ้าแก้ค่าข้างในฟังก์ชัน ตัวแปรต้นฉบับจะไม่เปลี่ยน
    
    int a = 10;

    change(a);

    std::cout << a << '\n'; // 10
    
    return 0;
}

void change(int x){
    x = 100;
}