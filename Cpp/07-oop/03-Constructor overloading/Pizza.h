#ifndef PIZZA_H
#define PIZZA_H

#include <string>

class Pizza{
    private:
        std::string topping1;
        std::string topping2;
    public:
        Pizza(std::string topping1);
        Pizza(std::string topping1, std::string topping2);
};

#endif
