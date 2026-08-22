#include <iostream>

int main(){

    // array = โครงสร้างข้อมูลที่สามารถเก็บค่าหลายค่าได้
    //         โดยค่าต่าง ๆ จะถูกเข้าถึงผ่านหมายเลข index
    //         "คล้ายกับตัวแปรที่สามารถเก็บค่าได้หลายค่า"

    //EX.1
    std::string cars[] = {"Corvette", "Mustang", "camry"};

    cars[1] = "Camaro";

    std::cout << cars[0] << '\n'; // Corvette

    //EX.2
    std::string fruits[3];

    fruits[0] = "appple";
    fruits[1] = "banana";
    fruits[2] = "orange";

    // sizeof() = ใช้สำหรับหาขนาดเป็นหน่วยไบต์ (bytes) ของ
    //             ตัวแปร, ชนิดข้อมูล (data type), class, object เป็นต้น

    std::string name = "tle";
    double gpa = 2.5;
    char grade = 'f';
    bool student = false;
    char grades[] = {'A', 'B', 'C'};

    std::cout << sizeof(name) << " bytes\n"; // 32 bytes

    std::cout << sizeof(grades)/sizeof(char) << " element\n"; // 5 element

    // การเข้าถึงสมาชิกทุกตัว

    std::string students[] = {"Spongebob", "Patrick", "Squidward"};

    for(int i = 0; i < sizeof(students)/sizeof(std::string); i++){
        std::cout << students[i] << '\n';
    }

    // foreach loop = loop ที่ช่วยให้การวนอ่าน/เข้าถึงข้อมูล ในชุดข้อมูลที่สามารถวนซ้ำได้ง่ายขึ้น 

    std::string students[] = {"Spongebob", "Patrick", "Squidward"};

    for(std::string student : students){
        std::cout << student << '\n';
    }

    return 0;
}