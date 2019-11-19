//
// Created by Brett Morrison on 2019-11-15.
//

#include <iostream>
#include <regex>
#include <string>

using namespace std;

bool isVowel(string character);
bool isBadInput(string character);

int main() {
    string input;

    // variables declarations split between global / current.
    int numWords = 0, maxVowels = 0, longestWord = 0;
    int currentVowels = 0, currentLength = 0;

    bool userWasDumb = false;
    bool isFirstCharacter = true;

    cout << "Please enter a sentence (No symbols or numbers):" << endl;

    input = cin.get();

    while(input != "\n") {
        if(isVowel(input)){currentVowels++;}
        if(isBadInput(input)){userWasDumb = true;}

        if(input == " "){
            currentLength = 0;
            currentVowels = 0;
            isFirstCharacter = true; // numWords won't increase until input isn't a space.
        } else {
            if(isFirstCharacter){
                numWords++;
                isFirstCharacter = false;
            }
            currentLength++;
        }

        longestWord = currentLength > longestWord ? currentLength : longestWord;
        maxVowels = currentVowels > maxVowels ? currentVowels : maxVowels;
        input = cin.get();
    }

    if(userWasDumb){
        //tell the user to get fucked if they violate the rules
        cout << "\nYou didn't follow rules. No analysis for you.";
    } else {
        cout << "\nSentence Breakdown:" << endl;
        cout << "Number of words: " << numWords << endl;
        cout << "Largest number of vowels: " << maxVowels << endl;
        cout << "Longest word length: " << longestWord << " characters" << endl;
    }
    return 0;
}

bool isVowel(string character){
    return regex_match(character, regex("[aeiouAEIOU]"));
}

bool isBadInput(string character){
    return regex_match(character, regex("[^[:alpha:]\\s]"));
}