#include <iostream>

struct Car{
    std::string model;
    int year;
    std::string color;
};

void printCar(Car &car);
void printCar(Car &car, std::string color);

int main(){

    Car car1;
    Car car2;

    car1.model = "Mustang";
    car1.year = 2023;
    car1.color = "red";

    car2.model = "Corvette";
    car2.year = 2024;
    car2.color = "blue";

    printCar(car1, "silver");
    printCar(car2, "gold");
    
    printCar(car1);
    // address ของ car1
    // Mustang
    // 2023
    // silver

    printCar(car2);
    // address ของ car2
    // Corvette
    // 2024
    // gold

    return 0;
}

void printCar(Car &car){
    std::cout << &car << '\n';      
    std::cout << car.model << '\n'; 
    std::cout << car.year << '\n';  
    std::cout << car.color << '\n'; 
}
void printCar(Car &car, std::string color){
    car.color = color;
}