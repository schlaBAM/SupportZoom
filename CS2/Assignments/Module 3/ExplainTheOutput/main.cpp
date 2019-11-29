#include <iostream>
using namespace std;

void changeValue(int *element)
{
    *element += 999;
    //increments value stored at pointer's referenced address by 999
}

int main()
{
    int stuff[5]; // static 5 element integer array

    for (int i=0; i < 5; i++)
    {
        stuff[i] = i; //assigns element's position integer value to element's position
    }

    int *otherStuff = stuff; //creates pointer to stuff

    for (int i=0; i < 5; i++)
    {
        otherStuff[i] = i*2; //multiplies each element otherStuff points to by 2
    }

    changeValue(&(otherStuff[0])); //called on position 0 of otherStuff - so stuff[0] is 999 (0*2+999)

    for (int i=0; i < 5; i++)
    {
        cout << stuff[i] << endl;
        //prints 999, 2, 4, 6, 8
    }

    return 0;
}