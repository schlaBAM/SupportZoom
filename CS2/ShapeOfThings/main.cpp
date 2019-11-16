//
// Created by Brett Morrison on 2019-11-15.
//

#include <iostream>

using namespace std;

void printPoundSymbols(int num, bool endOfLine){
    for(int i = 0; i < num; i++){
        cout << '#';
    }

    if(endOfLine){
        cout << '\n';
    }
}

void printSpaces(int numSpaces){
    for(int i = 0; i < numSpaces; i++){
        cout << ' ';
    }
}

int main(){

    int outsideSpaces = 0;
    int insideSpaces = 16;
    int numPounds = 1;

    for(int i = 1; i <= 10; i++) {

        printSpaces(outsideSpaces);
        printPoundSymbols(numPounds, false);

        if(i != 5 && i != 6){
            printSpaces(insideSpaces);
        }
        printPoundSymbols(numPounds, true);

        if(i < 5) {
            numPounds++;
            insideSpaces -= 4;
            outsideSpaces++;
        } else if(i > 5){
            numPounds--;
            insideSpaces += 4;
            outsideSpaces--;
        }
    }
    return 0;
}