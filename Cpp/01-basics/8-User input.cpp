#include <iostream>

// cout << (insertion operator)
// cin >> (extraction operator)

int main() {
 
    int age;
    std::string name;

    //EX.1
    std::cout << "What's your name?: ";
    std::getline(std::cin >> std::ws, name);
    // getline() = รับข้อมูลทั้งบรรทัด
    // std::ws = ข้าม whitespace ที่ค้างอยู่ใน input

    std::cout << "What's your age?: ";
    std::cin >> age;

    //EX.2
    std::cin >> age;
    std::cin.ignore();
    std::getline(std::cin, name);

    return 0;
}