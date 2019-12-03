/*
 * Translating:
 * public class Question2
{
  public static float getAverageScore(int[] scoreArray)
  {
    float total = 0;
    for (int i=0; i < scoreArray.length; i++)
    {
      total += scoreArray[i];
    }
    return total / scoreArray.length;
  }

  public static void main(String[] args)
  {
    int[] scores = new int[10];

    for (int i=0; i < scores.length; i +=2 )
    {
      scores[i] = i;
    }

    System.out.println("Average score: " + getAverageScore(scores));
  }
}

 */


#include <iostream>
using namespace std;

float getAverageScore(int*, int);

int main(){
    const int ARRAY_SIZE = 10;

    int scores[ARRAY_SIZE];

    for(int i = 0; i < ARRAY_SIZE; i += 2){
        scores[i] = i;
    }

    cout << "Average score: " << getAverageScore(scores, ARRAY_SIZE) << endl;

    return 0;
}

float getAverageScore(int* scoreArray, int size){
    float total = 0;
    for(int i = 0; i < size; i++){
        total += scoreArray[i];
    }
    return total / size;
}