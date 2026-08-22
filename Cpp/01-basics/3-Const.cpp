#include <iostream>

int main(){

    // คำสั่ง const ใช้เพื่อกำหนดว่าค่าของตัวแปรเป็นค่าคงที่
    // บอกให้ compiler ป้องกันไม่ให้มีการแก้ไขค่าของตัวแปรนั้น
    // (อ่านได้อย่างเดียว / Read-only)

    const double PI = 3.14159;
    double radius = 10;
    double circumference = 2 * PI * radius;

    std::cout<< circumference << "cm" << '\n';

    return 0;
}