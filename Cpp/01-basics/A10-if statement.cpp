#include <iostream>

int main(){

    // if statements = คำสั่งที่ใช้ทำบางอย่างเมื่อเงื่อนไขเป็นจริง
    //                 ถ้าเงื่อนไขไม่เป็นจริง ก็จะไม่ทำสิ่งนั้น

    int age;

    std::cout << "Enter your age: " << '\n';
    std::cin >> age;

    if(age >= 100){
        std::cout << "You are too old to enter this site!";
    }
    else if(age >= 18){
        std::cout << "Welcome to the site!";
    }
    else if(age < 0){
        std::cout << "YOu haven't been born yet!";
    }
    else{
        std::cout << "You are not old enough to enter!";
    }

    // ternary operator ?: = ตัวดำเนินการแบบสามส่วน ใช้แทนคำสั่ง if/else ในกรณีง่าย ๆ
    // condition ? expression1 : expression2;

    //EX.1
    int grade = 50;

    grade >= 60 ? std::cout << "You pass!" : std::cout << "You fail!";

    //EX.2
    bool hungry = false;

    std::cout << (hungry ? "You are hungry" : "You are full");

    // && = ตรวจสอบว่าเงื่อนไขทั้งสองเป็นจริงหรือไม่
    // || = ตรวจสอบว่าอย่างน้อยหนึ่งในสองเงื่อนไขเป็นจริงหรือไม่
    // !  = กลับค่าทางตรรกะของ operand (ตัวถูกดำเนินการ)

    int temp;
    bool sunny = true;

    std::cout << "Enter the temperature: ";
    std::cin >> temp;

    //EX.1
    if(temp > 0 && temp < 30){
        std::cout << "The temperature is good!\n";
    }
    else{
        std::cout << "The temperature is bad!\n";
    }

    //EX.2
    if(temp <= 0 || temp >= 30){
        std::cout << "The temperature is bad!\n";
    }
    else{
        std::cout << "The temperature is good!\n";
    }

    //EX.3
    if(!sunny){
        std::cout << "It is cloudy outside!\n";
    }
    else{
        std::cout << "It is sunny outside!\n";
    }

    return 0;
}