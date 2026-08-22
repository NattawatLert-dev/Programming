#include <iostream>

int main(){

    // pseudo-random = สุ่มแบบเทียม ไม่ได้เป็นการสุ่มแบบแท้จริง แต่มีลักษณะใกล้เคียงกับการสุ่ม

    srand(time(NULL));

    int num = (rand() % 6) + 1;

    std::cout << num;

    return 0;
}