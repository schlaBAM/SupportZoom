package outfit;

import outfit.articleOfClothing.accessory.*;
import outfit.articleOfClothing.outerwear.*;
import outfit.articleOfClothing.shirt.*;
import outfit.articleOfClothing.pants.*;
import outfit.articleOfClothing.shoes.*;

import java.util.ArrayList;

public class Closet {

    static ArrayList<ArrayList<ArticleOfClothing>> generateCloset() {

        ArrayList<ArticleOfClothing> shirts;
        ArrayList<ArticleOfClothing> pants;
        ArrayList<ArticleOfClothing> shoes;
        ArrayList<ArticleOfClothing> outerwear;
        ArrayList<ArticleOfClothing> accessories;

        ButtonUpShirt buttonUpShirt = new ButtonUpShirt("all","blue", "formal", "both");
        Jersey jersey = new Jersey("all", "black", "casual", "both");
        Tshirt tshirt = new Tshirt("all", "plain", "casual", "both");
        Sweater sweater = new Sweater("winter", "brown", "casual", "both");
        Turtleneck turtleneck = new Turtleneck("fall", "red", "formal", "both");
        SleevelessShirt sleevelessShirt = new SleevelessShirt("summer", "blue", "casual", "male");
        TubeTop tubeTop = new TubeTop("summer", "red", "casual", "female");

        shirts = addToList(buttonUpShirt, jersey, tshirt, sweater, turtleneck, sleevelessShirt, tubeTop);

        Capris capris = new Capris("spring", "brown", "casual", "female");
        Jeans jeans = new Jeans("all", "blue", "casual", "both");
        Joggers joggers = new Joggers("all", "black", "casual", "male");
        Khakis khakis = new Khakis("fall", "green", "formal", "male");
        Shorts shorts = new Shorts("summer", "plain", "casual", "both");
        Slacks slacks = new Slacks("all", "plain", "formal", "both");
        Skirt skirt = new Skirt("summer", "red", "casual", "female");

        pants = addToList(capris, jeans, joggers, khakis, shorts, slacks, skirt);

        DressShoes dressShoes = new DressShoes("all", "black", "formal", "both");
        Heels heels = new Heels("all", "red", "formal", "female");
        RunningShoes runningShoes = new RunningShoes("all", "green", "casual", "both");
        Sandals sandals = new Sandals("summer", "plain", "casual", "both");
        SnowBoots snowBoots = new SnowBoots("winter", "brown", "casual", "both");
        SteelToedBoots steelToedBoots = new SteelToedBoots("all", "plain", "casual", "male");
        Timberlands timberlands = new Timberlands("fall", "brown", "casual", "male");

        shoes = addToList(dressShoes, heels, runningShoes, sandals, snowBoots, steelToedBoots, timberlands);

        Blazer blazer = new Blazer("all", "black", "formal", "both");
        Parka parka = new Parka("winter", "plain", "casual", "both");
        SpringCoat springCoat = new SpringCoat("spring", "green", "casual", "female");
        TrenchCoat trenchCoat = new TrenchCoat("fall", "plain", "casual", "male");
        Vest vest = new Vest("fall", "red", "casual", "both");
        WinterJacket winterJacket = new WinterJacket("winter", "blue", "casual", "both");
        GucciOvercoat gucciOvercoat = new GucciOvercoat("summer", "plain", "formal", "summer");

        outerwear = addToList(blazer, parka, springCoat, trenchCoat, vest, winterJacket, gucciOvercoat);

        Earrings earrings = new Earrings("all", "gold", "formal", "female");
        Necklace necklace = new Necklace("all", "gold", "formal", "both");
        Ring ring = new Ring("all", "gold", "casual", "both");
        Rolex rolex = new Rolex("all", "ballin", "formal", "male");
        Sunglasses sunglasses = new Sunglasses("summer", "black", "casual", "both");
        Tie tie = new Tie("all", "blue", "formal", "male");
        Watch watch = new Watch("all", "red", "casual", "both");

        accessories = addToList(earrings, necklace, ring, rolex, sunglasses, tie, watch);

        ArrayList<ArrayList<ArticleOfClothing>> closet = new ArrayList<>() {
            {
                add(shirts);
                add(pants);
                add(shoes);
                add(outerwear);
                add(accessories);
            }
        };
        return closet;

    }

    static ArrayList<ArticleOfClothing> addToList(ArticleOfClothing... items){
        ArrayList<ArticleOfClothing> list = new ArrayList<>();
        for(ArticleOfClothing item : items){
            list.add(item);
        }
        return list;
    }
}
