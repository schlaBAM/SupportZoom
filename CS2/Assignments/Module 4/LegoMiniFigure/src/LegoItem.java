package com.company;

public class LegoItem {

    String name;
    float weight;

    public LegoItem(String name, float weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return this.weight + " gram " + this.name;
    }

    public boolean isHeavy(float threshold){
        if(this == null) return false;
        return this.weight > threshold ? true : false;
    }

}


