#include "Pizza.h"
#include <iostream>

Pizza::Pizza(std::string topping1){
    this->topping1 = topping1;
}

Pizza::Pizza(std::string topping1, std::string topping2){
    this->topping1 = topping1;
    this->topping2 = topping2;
}