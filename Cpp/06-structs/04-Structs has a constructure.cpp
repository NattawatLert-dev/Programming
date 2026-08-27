#include <iostream>

struct Car{
    std::string model;
    int year;

    Car(std::string model, int year){
        this->model = model;
        this->year = year;
    }
    
    void showInfo(){
        std::cout << model << " " << year << '\n';
    }

};


int main(){

    Car car1("Mustang", 2023);
    Car car2("Ford", 2022);

    car1.showInfo();
    car2.showInfo();

    return 0;
}