#include <iostream>

void swap(int& a, int& b);

int main(){

    // Pass by Reference = ส่งตัวแปรตัวจริงเข้าไปในฟังก์ชัน แทนที่จะสร้างสำเนา
    //                     ดังนั้นถ้า function แก้ค่า ตัวแปรต้นฉบับก็ เปลี่ยนตามทันที

    int x = 10;
    int y = 20;

    swap(x, y);

    std::cout << x << '\n'; // 20
    std::cout << y << '\n'; // 10

    return 0;
}

void swap(int& a, int& b) {
    int temp = a;  // temp = 10
    a = b;         // x = 20
    b = temp;      // y = 10
}