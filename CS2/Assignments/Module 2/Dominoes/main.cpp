//
// Created by Brett Morrison on 2019-11-21.
//

#include <iostream>
#include <random>
#include <chrono>

using namespace std;

struct domino {
    int topNumber;
    int bottomNumber;
};

void createArray(domino[]);
void printDominoes(domino[], int);
void randomizeDominoes(domino dominoArray[], int size);
void drawDominoes(domino[], int);
void drawDominoSquare(int, bool);
int random(int);

int main() {

    const int NUM_DOMINOES = 28;

    domino dominoArray[NUM_DOMINOES];

    createArray(dominoArray);
    printDominoes(dominoArray, NUM_DOMINOES);

    cout << "\n" << "-----------------------------------" << "\n" << endl;

    randomizeDominoes(dominoArray, NUM_DOMINOES);
    printDominoes(dominoArray, NUM_DOMINOES);

    cout << "\n" << "-----------------------------------" << "\n" << endl;

    drawDominoes(dominoArray, NUM_DOMINOES);

    return 0;
}

void createArray(domino dominoArray[]) {
    int count = 0;
    for (int i = 0; i <= 6; i++) {
        for (int j = 0; j <= i; j++) {
            dominoArray[count] = domino{i, j};
            count++;
        }
    }
}

void printDominoes(domino dominoArray[], int size) {
    // prints dominoes in # | # form to ensure we've got em all. More for testing.
    for (int i = 0; i < size; i++) {
        cout << dominoArray[i].topNumber << " | " << dominoArray[i].bottomNumber << endl;
    }
}

void randomizeDominoes(domino *dominoArray, int size) {
    for(int i = 0; i < size; i++){
        int num = random(size);
        domino tmp = dominoArray[num % size];
        dominoArray[num] = dominoArray[i];
        dominoArray[i] = tmp;
    }
}

int random(int range) {
    default_random_engine engine (chrono::steady_clock::now().time_since_epoch().count());     // provide seed
    uniform_int_distribution<int> number {0,range - 1};   // engine generates numbers from 0 to range
    return number(engine);
}

void drawDominoes(domino dominoArray[], int size) {
    for (int i = 0; i < size; i++) {
        drawDominoSquare(dominoArray[i].topNumber, true);
        drawDominoSquare(dominoArray[i].bottomNumber, false);
    }
}

void drawDominoSquare(int number, bool isTopPanel) {

    const string blankLine = "|\t\t|";
    const string lineSpace = " - - - - ";
    const string oneDotLeft = "| o\t\t|";
    const string oneDotMiddle = "|\to\t|";
    const string oneDotRight = "|     o |";
    const string twoOnALine = "| o   o |";

    if (isTopPanel) {
        cout << lineSpace << endl; // top of domino
    }

    switch (number) {
        case 0:
            cout << blankLine << endl;
            cout << blankLine << endl;
            cout << blankLine << endl;
            cout << lineSpace << endl;
            break;
        case 1:
            cout << blankLine << endl;
            cout << oneDotMiddle << endl;
            cout << blankLine << endl;
            cout << lineSpace << endl;
            break;
        case 2:
            cout << oneDotLeft << endl;
            cout << blankLine << endl;
            cout << oneDotRight << endl;
            cout << lineSpace << endl;
            break;
        case 3:
            cout << oneDotLeft << endl;
            cout << oneDotMiddle << endl;
            cout << oneDotRight << endl;
            cout << lineSpace << endl;
            break;
        case 4:
            cout << twoOnALine << endl;
            cout << blankLine << endl;
            cout << twoOnALine << endl;
            cout << lineSpace << endl;
            break;
        case 5:
            cout << twoOnALine << endl;
            cout << oneDotMiddle << endl;
            cout << twoOnALine << endl;
            cout << lineSpace << endl;
            break;
        case 6:
            cout << twoOnALine << endl;
            cout << twoOnALine << endl;
            cout << twoOnALine << endl;
            cout << lineSpace << endl;
            break;
        default:
            //I really messed up if I hit this lol.
            cout << "How the hell did you hit this?" << endl;
            break;
    }
    if (!isTopPanel) {
        cout << "\n" << endl; // extra space to separate dominoes
    }
}