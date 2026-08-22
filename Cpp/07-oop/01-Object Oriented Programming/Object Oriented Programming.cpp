#include <iostream>

class Human{
    public:
        std::string name;
        std::string occupation;
        int age;

        void eat(){
            std::cout << "This person is eating\n";
        }
        void drink(){
            std::cout << "This person is drinking\n";
        }
        void sleep(){
            std::cout << "This person is sleeping\n";
        }
};

int main(){

    // object = สิ่งที่สร้างจาก class
    //          มีข้อมูล (attributes) และ มีการทำงาน (methods)
    //          เช่น Phone, Book, Student
    //          class = blueprint
    //          object = สิ่งที่สร้างจาก blueprint

    Human human1;

    human1.name = "Rick";
    human1.occupation = "scientist";
    human1.age = 70;

    std::cout << human1.name << '\n';        // Rick
    std::cout << human1.occupation << '\n';  // scientist
    std::cout << human1.age << '\n';         // 70

    human1.eat();
    human1.drink();
    human1.sleep();

    return 0;
}