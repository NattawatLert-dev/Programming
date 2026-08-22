#include <iostream>

int main(){
    
    // type conversion = การแปลงค่าจากชนิดข้อมูลหนึ่งไปเป็นอีกชนิดข้อมูลหนึ่ง
    //                   Implicit = การแปลงแบบอัตโนมัติ
    //                   Explicit = การแปลงโดยระบุชนิดข้อมูลใหม่ไว้ข้างหน้าค่า เช่น (int)

    double x = (int) 3.14;
    char y = 100;

    std::cout<< x << '\n'; // 3
    std::cout<< y << '\n'; // d
    std::cout<< (char) 100 << '\n'; // d

    int correct = 8;
    int questions = 10;
    double score = correct/(double)questions * 100;

    std::cout << score << "%"; // 80%

    return 0;
}