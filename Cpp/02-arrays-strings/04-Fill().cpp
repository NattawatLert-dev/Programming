#include <iostream>

int main(){

    // fill() = เติมค่าที่กำหนดลงในช่วงของสมาชิก (elements)
    //          fill(begin, end, value)

    std::string foods[100];

    fill(foods, foods + 100, "pizza");

    for(std::string food : foods){
        std::cout << food << '\n';
    }

    return 0;
}