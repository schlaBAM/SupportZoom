package outfit;

import outfit.interfaces.ClothesInterface;

import java.util.ArrayList;

public class ArticleOfClothing implements ClothesInterface {

    String season, style, color, gender;

    public ArticleOfClothing(String season, String color, String style, String gender) {
        this.season = season;
        this.color = color;
        this.style = style;
        this.gender = gender;
    }

    public boolean isColorful(){
        return !this.color.equals("plain");
    }

    public boolean isCasualStyle(){ return this.style.equals("casual"); }
    public boolean isFormalStyle() { return this.style.equals("formal"); }

    public boolean isGreenColor() { return this.color.equals("green"); }
    public boolean isBlueColor() { return this.color.equals("blue"); }
    public boolean isBrownColor() { return this.color.equals("brown"); }
    public boolean isRedColor() { return this.color.equals("red"); }
    public boolean isPurpleColor() { return this.color.equals("purple"); }
    public boolean isBlackColor() { return this.color.equals("black"); }
    public boolean isPlain() { return this.color.equals("plain"); }

    public boolean isForGender(String gender){
        return this.gender.equals(gender) || this.gender.equals("both");
    }

    public boolean canBeWornWith(ArrayList<ArticleOfClothing> list){
        for(ArticleOfClothing article : list){
            String name = article.getClass().getSimpleName();
            switch(this.getClass().getSimpleName()){
                case "GucciOvercoat":
                    return name.equals("Rolex") || name.equals("Necklace");
                case "Heels":
                    return name.equals("Earrings");
                case "SleevelessShirt":
                    return name.equals("Sandals") || name.equals("Shorts");
                case "Joggers":
                    return !name.equals("TrenchCoat");
                default:
                    break;
            }
        }
        return true;
    }

    public String toString(){
        return "- " + getColor().substring(0,1).toUpperCase() + getColor().substring(1) + " " + getClass().getSimpleName();
    }
    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getStyle() {
        return style;
    }

    @Override
    public String getSeason() {
        return season;
    }

    @Override
    public String getColor() {
        return color;
    }

}

