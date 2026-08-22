#include <iostream>

int factorial(int number);

int main(){

    // recursion = เทคนิคการเขียนโปรแกรมที่ฟังก์ชันเรียกใช้ตัวมันเอง
    //             ใช้แบ่งปัญหาที่ซับซ้อนออกเป็นขั้นตอนเล็ก ๆ
    //             แล้วทำขั้นตอนนั้นซ้ำไปเรื่อย ๆ จนถึงจุดหยุด

    // (iterative vs recursive) = การทำงานแบบใช้ Loop เทียบกับการทำงานแบบเรียกฟังก์ชันซ้ำ
    // advantages = ข้อดี 1.ใช้โค้ดน้อยลง และโค้ดดูสะอาดขึ้น
    //                  2.เหมาะกับอัลกอริทึมบางประเภท เช่น การเรียงข้อมูล (sorting) และการค้นหาข้อมูล (searching)
    // disadvantages = ข้อเสีย 1.ใช้ Memory มากกว่า
    //                       2.ทำงานช้ากว่า

    std::cout << factorial(10);

    return 0;
}

int factorial(int number){

    if(number > 1){
        return number * factorial(number - 1);
    }
    else{
        return 1;
    }
}