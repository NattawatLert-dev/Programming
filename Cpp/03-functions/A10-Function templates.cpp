#include <iostream>

template <typename T, typename U>

auto max(T x, U y){
    return (x > y) ? x : y;
}

int main(){

    // function template = แบบพิมพ์/แม่แบบของฟังก์ชัน
    //                     ใช้กำหนดว่า function จะมีหน้าตาและทำงานอย่างไร
    //                     สามารถนำแม่แบบนี้ไปสร้าง function ได้หลายแบบ
    //                     โดยแต่ละ function สามารถใช้ data type ที่แตกต่างกันได้

    std::cout << max(1.1, 2.1) << '\n'; // 2.1
    std::cout << max(1, 2) << '\n';     // 2

    std::cout << max(1, 2.1) << '\n';   // 2.1

    return 0;
}

/*
template <typename T>

T max(T x, T y){
    return (x > y) ? x : y;
}
*/
