#include <iostream>

struct Car{
    std::string model;
    int year;
};


int main(){

    Car car1{"Mustang", 2023};

    Car *ptr = &car1;

    std::cout << ptr->model << '\n';
    std::cout << ptr->year << '\n';

    return 0;
}
/*
    (*ptr).model   = ptr->model
*/