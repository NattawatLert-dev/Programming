#include "Student.h"
#include <iostream>

Student::Student(std::string name, int age) {
    this->name = name;
    this->age = age;
}

void Student::introduce() {
    std::cout << "My name is " << name << "\n";
    std::cout << "I am " << age << " years old.\n";
}

// Student::introduce()
// introduce() เป็นของ Class student

// this->name   → ตัวแปร name ของ Object
// name         → parameter ที่ส่งเข้ามา