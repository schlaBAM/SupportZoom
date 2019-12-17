package com.company;

public class Forward extends HockeyPlayer {

    String position; //LW, C, RW

    public Forward(String firstName, String lastName, String shoots, String team, String position, int goals, int assists) {
        super(firstName, lastName, shoots, team, goals, assists);
        this.position = position;
    }

    protected String complainToRef(String chirp){
        return chirp.toUpperCase();
    }

    public void dangle(){
        // gotem
    }

    public void snipe(String corner){
        // pick a corner for the gino
    }


}
