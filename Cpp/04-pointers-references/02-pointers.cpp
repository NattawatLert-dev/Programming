#include <iostream>

int main(){

    // Pointer = ตัวแปรที่เอาไว้เก็บ "ที่อยู่" ของตัวแปรอื่น
    //            ไม่ได้เก็บค่าของตัวแปร แต่เก็บว่าค่านั้นอยู่ตรงไหนใน Memory

    // & (address-of operator) = ขอ "ที่อยู่" ของตัวแปร
    //                           เช่น &x = ที่อยู่ของ x

    // * (dereference operator) = เข้าไปดู "ค่า" ที่อยู่ในที่อยู่นั้น
    //                            เช่น *p = ค่าของตัวแปรที่ p ชี้อยู่

    std::string name = "Tle";
    int age = 21;
    int arr[5] = {1, 2, 3, 4, 5};

    std::string *pName = &name;
    int *pAge = &age;
    int *pArr = arr;

    std::cout << pName << '\n';       // 0xb15fbff760
    std::cout << *pName << '\n';      // Tle
    std::cout << *pAge << '\n';       // 21 
    std::cout << *(pArr + 1) << '\n'; // 2

    return 0;
}