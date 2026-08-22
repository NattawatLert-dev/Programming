#include <iostream>

struct student{
    std::string name;
    double gpa;
    bool enrolled;
};

int main(){

    // struct = โครงสร้างที่ใช้รวบรวมตัวแปรที่เกี่ยวข้องกันเอาไว้ภายใต้ชื่อเดียวกัน

    //          struct สามารถเก็บข้อมูลได้หลายชนิด เช่น string, int, double, bool เป็นต้น
    //          ตัวแปรที่อยู่ภายใน struct เรียกว่า "members" หรือสมาชิกของ struct

    //          เราสามารถเข้าถึง members ได้ด้วยเครื่องหมาย .

    //          . = Class Member Access Operator
    //          = ตัวดำเนินการที่ใช้เข้าถึงสมาชิกของ struct/class

    student student1;
    student1.name = "Spongebob";
    student1.gpa = 3.2;
    student1.enrolled = true;

    std::cout << student1.name << '\n';      // Spongebob
    std::cout << student1.gpa << '\n';       // 3.2
    std::cout << student1.enrolled << '\n';  // 1

    return 0;
}