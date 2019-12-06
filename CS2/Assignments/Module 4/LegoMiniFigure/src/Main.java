package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LegoMinifigure person = new LegoMinifigure("Bob", new LegoHat("touque", 1));
        System.out.println(person.toString());
        System.out.println("Is " + person.name + " good? Answer: " + person.isGood("winter", (float)50.42) + "\n");

        LegoMinifigure p1 = new LegoMinifigure("Jim");
        System.out.println(p1.toString() + "\n");

        LegoMinifigure p2 = new LegoMinifigure("Karen", new LegoHat("SUN VISOR", 4));
        p2.setHandItem(new LegoItem("apple", (float)14.4), "LEFT");
        System.out.println(p2.toString());
        System.out.println(p2.name + "'s apparent hat style: " + p2.hatItem.computeStyle("winter") + " out of 10");
        p2.swapHands();
        p2.wearHat(new LegoHat("SOMBRERO", -5));
        p2.setHandItem(new LegoItem("machete", (float)0.4), "LEFT");
        System.out.println(p2.toString() + "\n");

        LegoMinifigure p3 = new LegoMinifigure("Sp00ky", new LegoHat("grapes", -1));
        System.out.println(p3.name + " is wearing " + p3.hatItem.toString());
        System.out.println("Is " + p3.name + " good? Answer: " + p3.isGood("winter", (float)10.0001) + "\n");

        LegoMinifigure p4 = new LegoMinifigure("CAPS MCCAPSERSON", new LegoHat("helmet", 3));
        System.out.println(p4.toString());
    }
}
