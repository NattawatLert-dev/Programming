#include <iostream>

void sort(int arr[], int size);

int main(){

    int array[] = {10, 1, 9, 2, 8, 3, 7, 4, 6 ,5};
    int size = sizeof(array)/sizeof(array[0]);

    sort(array, size);

    for(int element : array){
        std::cout << element << '\n';
    }

    return 0;
}

void sort(int arr[], int size){

    int temp;
    for (int i = 0; i < size - 1; i++){
        for (int j = 0; j < size - i - 1; j++){
            if(arr[j] < arr[j + 1]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        
    }
    

}