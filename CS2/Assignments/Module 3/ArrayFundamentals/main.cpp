#include <iostream>

using namespace std;

bool isSorted(int array[], int numItems);
int upcaseCount(char array[], int arraySize);

int main(){

    //Q1
    const int TEST_ARRAY_1_SIZE = 7;
    int testArray1[TEST_ARRAY_1_SIZE] = {4, 2, 4, 5, 6, 7, 8}; //false
    int testArray2[TEST_ARRAY_1_SIZE] = {2, 4, 4, 5, 6, 7, 8}; //true
    int testArray3[TEST_ARRAY_1_SIZE] = {8, 7, 6, 2, 4, 1, 10}; //false

    cout << "isSorted(1) returned " << isSorted(testArray1, TEST_ARRAY_1_SIZE) << endl;
    cout << "isSorted(2) returned " << isSorted(testArray2, TEST_ARRAY_1_SIZE) << endl;
    cout << "isSorted(3) returned " << isSorted(testArray3, TEST_ARRAY_1_SIZE) << endl;

    //Q2
    const int TEST_ARRAY_2_SIZE = 12;
    char testArray4[TEST_ARRAY_2_SIZE] = {'a', 'C', 'e', 'R', 'Q', '3', 'z', 'a', 'Q', 'M', 'r', 'p'}; //returns 5 upcase
    cout << "\nupcaseCount(4) returned " << upcaseCount(testArray4, TEST_ARRAY_2_SIZE) << " upcase chars" << endl;

    return 0;
}

bool isSorted(int array[], int numItems){

    int sortedArray[numItems];

    for(int i = 0; i < numItems; i++){
        sortedArray[i] = array[i]; //copy array for comparing
    }

    //selection sort
    for(int i = 0; i < numItems - 1; i++){
        int min = i;
        for(int j = i+1; j < numItems; j++){
            if(sortedArray[j] < sortedArray[min]){
                min = j;
            }
        }
        int tmp = sortedArray[i];
        sortedArray[i] = sortedArray[min];
        sortedArray[min] = tmp;
    }

    //comparision between arrays to check for equality
    for(int i = 0; i < numItems; i++){
        if(array[i] != sortedArray[i]) return false;
    }

    return true;

}

int upcaseCount(char array[], int arraySize){
    int count = 0;

    for(int i = 0; i < arraySize; i++){
        //if char is inbetween ascii values 65-90 count++
        int tmp = array[i];
        if(tmp >= 65 && tmp <= 90){
            count++;
        }
    }

    return count;
}