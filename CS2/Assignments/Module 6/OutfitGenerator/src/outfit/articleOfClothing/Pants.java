package outfit.articleOfClothing;
import outfit.ArticleOfClothing;

public abstract class Pants extends ArticleOfClothing {
    public Pants(String season, String color, String style, String gender) {
        super(season, color, style, gender);
    }

    public String toString(){
        return "- A pair of " + getColor().substring(0,1).toUpperCase() + getColor().substring(1) + " " + getClass().getSimpleName();
    }
}
