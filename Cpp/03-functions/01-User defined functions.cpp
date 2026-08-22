#include <iostream>

void happBirthday(std::string name, int age);

int main(){

    // function = ชุดคำสั่งหรือบล็อกของโค้ดที่สามารถนำกลับมาใช้ซ้ำได้

    std::string name = "Bro";
    int age = 21;

    happBirthday(name, age);

    return 0;
}

void happBirthday(std::string name, int age){
    std::cout << "Happy birthday to " << name << '\n';
    std::cout << "Happy birthday to " << name << '\n';
    std::cout << "Happy birthday dear " << name << '\n';
    std::cout << "Happy birthday to " << name << '\n';
    std:: cout << "You are " << age << " years old!" << '\n';
}