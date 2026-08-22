#include <iostream>
#include "Dog.h"

int main(){

    // Inheritance = การที่ Class หนึ่งสามารถสืบทอด attributes และ methods จากอีก Class หนึ่งได้
    //               Class ลูก (Child) จะสืบทอดจาก Class แม่ (Parent)
    //               ช่วยให้สามารถนำ Code ที่เหมือนกันกลับมาใช้ซ้ำได้

    Dog dog;

    dog.eat();
    dog.bark();

    return 0;
}