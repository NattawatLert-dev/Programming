#ifndef STUDENT_H // ถ้ายังไม่มี STUDENT_H ให้ทำโค้ดข้างล่าง (เอาไว้ป้องกันกรณีที่เรา #include "Student.h" ซ้ำหลายครั้ง)
#define STUDENT_H // ประกาศว่า STUDENT_H มีอยู่แล้วนะ

#include <string>

class Student {
    private:
        std::string name;
        int age;
    public:
        Student(std::string name, int age);

        void introduce();
};

#endif // จบเงื่อนไข