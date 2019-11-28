//Q1 - Write a loop that prints out the values of the integers in the array, being sure to check for
// and skip over the NULL value.

// Then write a loop that deletes the memory you created, again skipping the NULL value. After
// you delete the contents of pointers, it’s a good idea to assign NULL to them so they are not
// mistakenly used again.

#include <iostream>
using namespace std;

void printArray(int**);
void deleteArray(int**);

int main()
{
    int * pointerArray[4];

    pointerArray[0] = new int;
    pointerArray[1] = new int;
    pointerArray[2] = NULL;
    pointerArray[3] = new int;

    *(pointerArray[0]) = 1;
    *(pointerArray[1]) = 10;
    *(pointerArray[3]) = 50;

    printArray(pointerArray);
    cout << "-----------" << endl;
    deleteArray(pointerArray);
    cout << "-----------" << endl;
    printArray(pointerArray);

    return 0;
}

void printArray(int **ptr){
    for(int i = 0; i < 4; i++){
        if(ptr[i] != nullptr) { // check to see if address of pointer is null
            cout << *ptr[i] << endl; // print value at pointerArray's position if not null
        }
    }
}

void deleteArray(int **ptr){
    for(int i = 0; i < 4; i++){
        if(ptr[i] != nullptr) { // check to see if address of pointer is null
            delete ptr[i]; // print value at pointerArray's position if not null
            ptr[i] = nullptr;
        }
    }
}


/*
Q2 - If null check doesn't exist program will only print values before null - so in this case
 1 and 10. NULL is a null pointer constant and will cause a runtime error without the check.
 So everything after the NULL won't be printed and the system will return a non-zero result
 (in my case exit code 11).
*/