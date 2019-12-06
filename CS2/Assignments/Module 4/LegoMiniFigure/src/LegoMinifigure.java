package com.company;

public class LegoMinifigure {

    String name;
    LegoHat hatItem;
    LegoItem leftHandItem;
    LegoItem rightHandItem;

    public LegoMinifigure(String name){
        this.name = name;
    }

    public LegoMinifigure(String name, LegoHat hatItem){
        this.name = name;
        this.hatItem = hatItem;
    }

    public String toString(){
        // this one's a little messy but I wanted to have fun with it. It was originally a very nested ternary statement
        // so be thankful I swapped it over

        String result = "A lego figure named " + name;

        if(hatItem != null){
            result += " is wearing a very lovely " + hatItem.toString();
            if(leftHandItem != null){
                result += " and is also spouting a " + leftHandItem.toString() + " in their left hand";
                if(rightHandItem != null){
                    result += " AND has a " + rightHandItem.toString() + " in their right hand. Holy shit are they fancy!";
                } else {
                    result += ". Not overly badass, but hey they're trying.";
                }
            } else if(rightHandItem != null){
                result += " and has a " + rightHandItem.toString() + " in their right hand. Not a southpaw I guess.";
            }
        } else if(leftHandItem != null){
            if(rightHandItem != null) {
                result += " has their hands full! " + leftHandItem.toString().substring(0,1).toUpperCase()
                        + " in their left hand and a " + rightHandItem.toString() + " in their right. Damn.";
            } else {
                result += " only has a " + leftHandItem.toString() + " in their left hand. Not cool.";
            }
        } else if(rightHandItem != null){
            result += " and only has a " + rightHandItem.toString() + " in their right hand. Still room for upgrades.";
        } else {
            result += " doesn't like material things. To be more straightforward, " + name + " is a plain jane.";
        }

        return result;
    }

    public void swapHands(){
        LegoItem temp = leftHandItem;
        rightHandItem = leftHandItem;
        leftHandItem = temp;
    }

    public void wearHat(LegoHat hat){
        hatItem = hat;
    }

    public void setHandItem(LegoItem item, String hand){

        hand = hand.toLowerCase();

        if(hand.equals("left")){
            leftHandItem = item;
        } else if(hand.equals("right")){
            rightHandItem = item;
        } else {
            System.out.println("your item may not be placed there ya doofus");
        }
    }

    public boolean isGood(String season, float threshold){

        if(hatItem == null) return false;

        boolean inStyle = hatItem.computeStyle(season) >= 6; // compute once for reuse

        if(!inStyle) return false;

        if(leftHandItem != null && rightHandItem != null){
            return inStyle && !leftHandItem.isHeavy(threshold) && !rightHandItem.isHeavy(threshold);
        } else if (leftHandItem != null){
            return !leftHandItem.isHeavy(threshold);
        } else if (rightHandItem != null){
            return !rightHandItem.isHeavy(threshold);
        } else return true; //no items, nothing heavy
    }



}
