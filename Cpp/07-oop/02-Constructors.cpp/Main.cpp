#include <iostream>
#include "Student.h"

int main() {

    // Constructor = method พิเศษที่ทำงานตอนสร้าง object
    //               ใช้กำหนดค่าเริ่มต้นให้กับ attributes

    Student student("Tle", 21);

    student.introduce();

    return 0;
}

/*
.h
↓
"Class มีอะไร?"

.cpp
↓
"Class ทำงานยังไง?"

main.cpp
↓
"เอา Class มาใช้"
*/

// ถ้าใช้ g++ compile เอง ต้องเอา .cpp ทุกไฟล์ มารวมกัน
// g++ main.cpp Student.cpp -o program