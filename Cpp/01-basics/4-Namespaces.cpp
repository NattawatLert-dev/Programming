#include <iostream>

namespace first{
    int x = 1;
}

namespace second{
    int x = 2;
}

int main(){
    using namespace std;
    
    using namespace second;

    // Namespace = ใช้สำหรับป้องกันปัญหาชื่อซ้ำกันในโปรเจกต์ขนาดใหญ่ โดยแต่ละสิ่ง (entity) ควรมีชื่อที่ไม่ซ้ำกัน
    //             Namespace ช่วยให้สามารถมีสิ่งที่ชื่อเหมือนกันได้ ตราบใดที่สิ่งเหล่านั้นอยู่ใน Namespace ที่แตกต่างกัน

    cout<< x; // 2
    // std::cout<< first::x; // 1

    return 0;
}