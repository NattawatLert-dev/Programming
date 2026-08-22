#include <iostream>

int main(){

    std::string name;

    std::cout << "Enter your name: ";
    std::getline(std::cin, name);

    //EX.1
    if(name.length() > 12){
        std::cout << "You name cant't be over 12 character" << '\n';
    }
    else{
        std::cout << "Welcome " << name << '\n';
    }

    //EX.2
    if(name.empty()){
        std::cout << "You didn't enter your name" << '\n';
    }
    else{
        std::cout << "Hello " << name << '\n';
    }

    //EX.3
    // name.clear()

    //EX.4
    name.append("@gmail.com");

    std::cout << "Your username is now " << name << '\n'; // Nattawat@gmail.com

    //EX.5
    std::cout << name.at(0); // N

    //EX.6
    name.insert(0, "@");

    std::cout << name; // @Nattawat

    //EX.7 Bro code
    std::cout << name.find(' '); // 3

    //EX.8 Bro code
    name.erase(0, 3);

    std::cout << name; // code

    return 0;
}