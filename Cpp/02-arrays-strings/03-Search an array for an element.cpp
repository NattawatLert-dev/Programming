#include <iostream>

int searchNum(int arr[], int size, int target);

int main(){

    int numbers[] = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10};
    int size = sizeof(numbers)/sizeof(numbers[0]);

    int index = searchNum(numbers, size, 4);

    std::cout << index << '\n';

    return 0;
}

int searchNum(int arr[], int size, int target){

    for(int i = 0; i < size; i++){
        if(arr[i] == target){
            return i;
        }
    }

    return -1;
}
