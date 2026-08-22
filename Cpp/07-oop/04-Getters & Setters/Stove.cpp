#include "Stove.h"
#include <iostream>

Stove::Stove(int temperature){
    setTemperature(temperature);
}

void Stove::setTemperature(int temperature){
    if(temperature < 0){
        this->temperature = 0;
    }
    else{
        this->temperature = temperature;
    }
}

int Stove::getTemperature(){
    return temperature;
}
