#include <iostream>

void printInfo(const std::string &name, const int &age);

int main(){

    // const parameter = พารามิเตอร์ที่มีลักษณะเหมือน "อ่านอย่างเดียว"
    //                   ไม่สามารถเปลี่ยนค่าของ parameter ภายในฟังก์ชันได้
    //                   ทำให้โค้ดปลอดภัยมากขึ้น และสื่อให้เห็นเจตนาของโค้ด
    //                   มีประโยชน์เมื่อใช้กับ reference และ pointer

    std::string name = "Tle";
    int age = 21;

    printInfo(name, age);

    return 0;
}

void printInfo(const std::string &name, const int &age){
    std::cout << name << '\n';
    std::cout << age << '\n';
}

// const string& name คือ ตัวจริง + ห้ามแก้
// const string name คือ สำเนา + ห้ามแก้