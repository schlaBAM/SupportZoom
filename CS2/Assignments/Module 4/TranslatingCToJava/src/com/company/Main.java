package com.company;

public class Main {

    public static void main(String[] args){
        /*
        (Array initialization)
        Translating:
          const int NUM_TAPES = 3;
          scotchTape tapes[NUM_TAPES] = {
            {"clear", 3, 22},
            {"green", 1, 15},
            {"blue", 2, 19},
          };
         */

        final int NUM_TAPES = 3; //not that we need it
        ScotchTape[] tapes = new ScotchTape[]{
                new ScotchTape("clear", 3, 22),
                new ScotchTape("green", 1, 15),
                new ScotchTape("blue", 2, 19)
        };

        printTapeArray(tapes);

        stickTape(tapes[0], 0.5);
        stickTape(tapes[1], 0.3);
        stickTape(tapes[2], 0.9);

        System.out.println();

        printTapeArray(tapes);
    }

    /*
    Translating:
    void printTapeArray(scotchTape tapeArray[], int length){
      for (int i=0; i < length; i++){
        cout << tapeArray[i].colour << " ("
         << tapeArray[i].length << " cm, "
         << tapeArray[i].weight << " oz)" << endl;
    }
}
     */
    public static void printTapeArray(ScotchTape[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].colour + " (" + array[i].length + " cm, " + array[i].weight  +" oz)");
        }
    }

    public static void stickTape(ScotchTape tape, double percentToUse){
        tape.weight -= tape.weight * percentToUse;
        tape.length -= tape.length * percentToUse;
    }
}
