#ifndef STOVE_H
#define STOVE_H

class Stove{
    private:
        int temperature = 0;
    public:
        Stove(int temperature);
        int getTemperature();
        void setTemperature(int temperature);
};

#endif