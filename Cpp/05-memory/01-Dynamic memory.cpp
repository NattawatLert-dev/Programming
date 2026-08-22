#include <iostream>

int main(){

    // dynamic memory = หน่วยความจำที่ถูกจองหลังจากที่โปรแกรมถูก compile และกำลังทำงานอยู่แล้ว

    //                  ใช้คำสั่ง 'new' เพื่อจอง Memory ในส่วนที่เรียกว่า Heap แทนที่จะจองใน Stack

    //                  มีประโยชน์เมื่อเราไม่รู้ล่วงหน้าว่าจะต้องใช้ Memory มากแค่ไหน

    //                  ทำให้โปรแกรมยืดหยุ่นมากขึ้นโดยเฉพาะตอนที่รับข้อมูลจากผู้ใช้

    //EX.1
    int *pNum = NULL;

    pNum = new int;

    *pNum = 21;

    std::cout << "Address: " << pNum << '\n';  // Address: 0x217247119b0
    std::cout << "Value: " << *pNum << '\n';   // Value: 21

    delete pNum;

    //EX.2
    char *pGrades = NULL;
    int size;

    std::cout << "How many grades to enter in?: ";
    std::cin >> size;

    pGrades = new char[size];

    for(int i = 0; i < size; i++){
        std::cout << "Enter grade #" << (i + 1) << '\n';
        std::cin >> pGrades[i];
    }

    for(int i = 0; i < size; i++){
        std::cout << pGrades[i] << " ";
    }

    delete[] pGrades;


    return 0;
}

/*
Stack = พื้นที่ที่จัดการให้อัตโนมัติ
Heap  = พื้นที่ที่เราสามารถจองเองได้ด้วย new

new → "ขอพื้นที่ Memory"
*   → "เข้าไปใช้พื้นที่นั้น"
delete → "คืนพื้นที่นั้น"
*/