package com.company;
import java.util.Random;

public class LegoHat {

    String style;
    int size;

    public LegoHat(String style, int size){
        this.style = style.toLowerCase();
        this.size = size;
    }

    public String toString(){
        String result = "";

        switch (size) {
            case 0:
                result += "XS ";
                break;
            case 1:
                result += "small ";
                break;
            case 2:
                result += "medium ";
                break;
            case 3:
                result += "large ";
                break;
            case 4:
                result += "XL ";
                break;
            default:
                result += "outrageously large ";
                break;
        }

        result += style;
        return result;
    }

    public int computeStyle(String season){

        season = season.toLowerCase();

        if(style.equals("touque")){
            return season.equals("winter") ? 10 : 1;
        } else if (style.equals("sun visor")) {
            return season.equals("summer") ? 5 : 1; //let's be honest sun visors are never perfect
        } else {
            Random rand = new Random();
            return rand.nextInt(10) + 1; // change 0-9 range to 1-10
        }
    }
}
