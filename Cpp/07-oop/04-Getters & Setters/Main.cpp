#include <iostream>
#include "Stove.h"

int main(){

    // Abstraction = การซ่อนรายละเอียดที่ไม่จำเป็นจากภายนอกทำให้ผู้ใช้เห็นเฉพาะสิ่งที่จำเป็นต้องใช้งาน
    // Getter = function ที่ใช้สำหรับ "อ่าน" ค่าของ private attribute
    // Setter = function ที่ใช้สำหรับ "แก้ไข" ค่าของ private attribute

    Stove stove(10000);

    stove.setTemperature(100);

    std::cout <<"The temperature setter is: " << stove.getTemperature() << '\n';

    return 0;
}