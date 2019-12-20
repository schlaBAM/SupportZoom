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

