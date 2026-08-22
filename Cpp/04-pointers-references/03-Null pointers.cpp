#include <iostream>

int main(){

    // Null value = ค่าพิเศษที่หมายความว่า "ไม่มีค่า"
    //              เมื่อ Pointer เก็บค่า Null อยู่
    //              Pointer นั้นจะไม่ได้ชี้ไปที่อะไร
    //              (เรียกว่า Null Pointer)

    // nullptr = คีย์เวิร์ดที่ใช้แทนค่าของ Null Pointer

    // nullptrs = มีประโยชน์ในการตรวจสอบว่า
    //            Address ถูกกำหนดให้กับ Pointer สำเร็จหรือไม่

    // เวลาใช้ Pointer ต้องระวังว่าโค้ดของเราไม่ได้ พยายามเข้าถึงค่าจาก Pointer ที่เป็น null
    // หรือ Pointer กำลังชี้ไปยัง Memory ที่ถูกคืน/ถูกปล่อยไปแล้ว เพราะสิ่งเหล่านี้จะทำให้เกิด Undefined Behavior

    int *pointer = nullptr;
    int x = 123;

    pointer = &x; // เอา Address ของ x ให้ pointer

    if(pointer == nullptr){
        std::cout << "address was not assigned!\n";
    }
    else{
        std::cout << "address was assigned!\n";
        std::cout << *pointer;
    }

    return 0;
}