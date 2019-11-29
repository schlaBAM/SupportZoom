#include <iostream>
#include <string>

using namespace std;

struct song {
    string title;
    string artist;
    int creationYear;

    string songToString(){
        return title + " - " + artist + " (" + to_string(creationYear) + ")";
    }
};

void printLibrary(song**, int);
song** songsFromYear(song **songs, int size, int year, int* resultSize);
void deallocateMemory(song**, int);
void addSongs(song**, int);

int main(){

    int LIBRARY_SIZE = 10;
    song **songLibrary = new song*[LIBRARY_SIZE];

    addSongs(songLibrary, LIBRARY_SIZE);
    printLibrary(songLibrary, LIBRARY_SIZE);

    cout << "-----------" << endl;

    int resultSize = 0;

    song **resultArray = songsFromYear(songLibrary, LIBRARY_SIZE, 2014, &resultSize);
    printLibrary(resultArray, resultSize);
//    printLibrary(songsFromYear(songLibrary, LIBRARY_SIZE, 2014, &resultSize), resultSize);
    cout << "Clearing filtered song library.." << endl;
    deallocateMemory(resultArray, resultSize);

    cout << "\n-----------" << endl;

    resultSize = 0;
    resultArray = songsFromYear(songLibrary, LIBRARY_SIZE, 2016, &resultSize);
    printLibrary(resultArray, resultSize);
    cout << "Clearing filtered song library.." << endl;
    deallocateMemory(resultArray, resultSize);

    cout << "\n-----------" << endl;

    cout << "\nClearing main song library.." << endl;
    deallocateMemory(songLibrary, LIBRARY_SIZE);
//    printLibrary(songLibrary, LIBRARY_SIZE);

    return 0;
}

void printLibrary(song **library, int size){

    cout << "\nAvailable songs in this library: \n" << endl;

    for(int i = 0; i < size; i++){
        if(library[i] != nullptr){
            cout << "\t" + library[i]->songToString() << endl;
        } else {
            cout << "Element at position " + to_string(i) + " is null" << endl;
        }
    }
    cout << endl;
}

void addSongs(song **songLibrary, int size) {

    for(int i = 0; i < size; i++){
        songLibrary[i] = new song;
    }

    //think this is what's being asked for.

    (*songLibrary[0]) = {"Put It On", "Big L", 1995};
    (*songLibrary[1]) = {"Under Pressure", "Logic", 2014};
    (*songLibrary[2]) = {"What's My Age Again?", "Blink 182", 1999};
    (*songLibrary[3]) = {"Feeling This", "Blink 182", 2003};
    (*songLibrary[4]) = {"The Hell Song", "Sum 41", 2002};
    (*songLibrary[5]) = {"Hell Of A Night", "ScHoolboy Q", 2014};
    (*songLibrary[6]) = {"G.O.M.D.", "J Cole", 2014};
    (*songLibrary[7]) = {"Neighbors", "J Cole", 2016};
    (*songLibrary[8]) = {"Dang!", "Mac Miller", 2016};
    (*songLibrary[9]) = {"What's The Use", "Mac Miller", 2018};

}

song** songsFromYear(song **songs, int size, int year, int* resultSize){

    // resultSize starts pointing to 0
    // in loop, if song.year == year then place into resArray[resultSize++]
    // after loop return resArray

    song **resultArray = new song *[size];

    for(int i = 0; i < size; i++){
        if(songs[i]->creationYear == year){
            *resultSize = *resultSize + 1;
            resultArray[*resultSize - 1] = new song;
            (*resultArray[*resultSize - 1]) = {songs[i]->title, songs[i]->artist, songs[i]->creationYear};
        }
    }

    return resultArray;
}

void deallocateMemory(song **library, int size){

    //TODO Be sure to properly deallocate all dynamically allocated memory. For every
    // call to new, there should be a corresponding delete or delete[].

    for(int i = 0; i < size; i++){
        if(library[i] != nullptr)
            delete library[i];
        library[i] = nullptr;
    }

    delete [] library;

    cout << "Memory de-allocated successfully." << endl;
}
