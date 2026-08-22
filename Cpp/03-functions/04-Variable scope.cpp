#include <iostream>

int myNum = 3;  // Global variable

void printNum();

int main(){

    // Local variables = ตัวแปรที่ประกาศภายในฟังก์ชันหรือบล็อก {}
    // Global variables = ตัวแปรที่ประกาศอยู่นอกฟังก์ชันทั้งหมด

    int myNum = 1;
    printNum();
    std::cout << ::myNum << '\n'; // 3

    return 0;
}

void printNum(){
    int myNum = 2; // Local variable

    std::cout << ::myNum << '\n'; // 3
}