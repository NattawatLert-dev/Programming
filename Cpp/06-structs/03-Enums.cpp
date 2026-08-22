#include <iostream>

enum Day {sunday = 0, monday = 1, tuesday = 2, wednesday = 3,
          thursday = 4, friday = 5, saturday = 6};

int main(){

    // enums = ชนิดข้อมูลที่ผู้เขียนโปรแกรมสร้างขึ้นเอง
    //         ภายในจะมีค่าคงที่แบบจำนวนเต็ม (integer) หลายค่า
    //         แต่ละค่าจะมีชื่อกำกับไว้
    //         เหมาะมากเมื่อเรามีตัวเลือกที่เป็นไปได้หลายตัว

    Day today = sunday;

    switch (today){
        case 0: std::cout << "It is Sunday!\n"; break;
        case 1: std::cout << "It is Monday!\n"; break;
        case 2: std::cout << "It is Tuesday!\n"; break;
        case 3: std::cout << "It is Wednesday!\n"; break;
        case 4: std::cout << "It is Thursday!\n"; break;
        case 5: std::cout << "It is Friday!\n"; break;
        case 6: std::cout << "It is Saturday!\n"; break;
    }
}
