package outfit.articleOfClothing;
import outfit.ArticleOfClothing;

public abstract class Shoes extends ArticleOfClothing {
    public Shoes(String season, String color, String style, String gender) {
        super(season, color, style, gender);
    }

    public abstract boolean isFancy();
    public abstract boolean isPlain();

}
