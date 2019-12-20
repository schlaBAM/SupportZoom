package outfit;

import outfit.interfaces.ClothesInterface;

public class ArticleOfClothing implements ClothesInterface {

    String season, style, color, gender;

    public ArticleOfClothing(String season, String style, String color, String gender) {
        this.season = season;
        this.style = style;
        this.color = color;
        this.gender = gender;
    }

    public boolean isColorful(){
        return !this.color.equals("plain");
    }

    public boolean isCasualStyle(){
        return this.style == "casual";
    }

    public boolean isForGender(ArticleOfClothing article){
        return article.getGender() == this.gender || article.getGender() == "both";
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

