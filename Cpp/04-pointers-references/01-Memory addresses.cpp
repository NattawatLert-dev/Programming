#include <iostream>

int main(){

    // memory address = ตำแหน่งในหน่วยความจำที่ข้อมูลถูกเก็บไว้
    // เราสามารถเข้าถึง/ดูตำแหน่งของข้อมูลในหน่วยความจำได้ด้วย & ซึ่งเรียกว่า address-of operator

    std::string name = "Tle";
    int age = 21;
    bool student = true;

    std::cout << &name << '\n';    // 0xfxbbff600
    std::cout << &age << '\n';     // 0xfxbbff5fc
    std::cout << &student << '\n'; // 0xfxbbff5fb

    return 0;
}