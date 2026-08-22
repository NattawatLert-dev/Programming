#include <iostream>
#include <vector>

typedef std::vector<std::pair<std::string, int>> pairlist_t;
//typedef std::string text_t;
//typedef int number_t;

using text_t = std::string;
using number_t = int;

int main() {

    // typedef = คีย์เวิร์ดที่ใช้สำหรับสร้างชื่อเพิ่มเติม (alias) ให้กับชนิดข้อมูล (data type) อื่น
    //           เป็นการสร้างชื่อใหม่ให้กับชนิดข้อมูลที่มีอยู่แล้ว
    //           ช่วยให้อ่านโค้ดได้ง่ายขึ้น และลดความยาวของชนิดข้อมูล
    //           ปัจจุบันสามารถใช้ 'using' แทนได้
    //           โดย 'using' ทำงานร่วมกับ templates ได้ดีกว่า

    pairlist_t pairlist;

    text_t firstname = "Tle";
    number_t age = 21;

    std::cout << firstname << '\n';
    std::cout << age << '\n';

    return 0;
}