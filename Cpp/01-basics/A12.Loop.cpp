#include <iostream>

int main(){

    // while loop
    std::string name;

    while(name.empty()){
        std::cout << "Enter your name: ";
        std::getline(std::cin, name);
    }

    std::cout << "Hello " << name;

    // do while loop = ทำชุดคำสั่งก่อนหนึ่งครั้ง จากนั้นจึงทำซ้ำอีกครั้ง หากเงื่อนไขเป็นจริง

    int number;

    do{
        std::cout << "Enter a positive #: ";
        std::cin >> number;
    }while(number < 0);

    std::cout << "The # is: " << number;

    // for loop
    
    //EX.1
    for(int i = 1; i <= 3; i++){
        std::cout << "HAPPY NEW YEAR!" <<'\n';
    }

    //EX.2
    for(int i = 1; i <= 3; i++){
        std::cout << i <<'\n';
    }

    // break = ออกจาก loop ทันที  
    // continue = ข้ามรอบการทำงานปัจจุบัน

    for(int i = 1; i <= 20; i++){
        if(i == 13){
            break;
        }
        std::cout << i << '\n';
    }

    // Nested loop
    /*
        loop(){
            loop(){
            }
        }
    */

    for(int i = 1; i <= 3; i++){
        for(int j = 1; j <= 10; j++){
            std::cout << i << ' ';
        }
        std::cout << '\n';
    }

    return 0;
}