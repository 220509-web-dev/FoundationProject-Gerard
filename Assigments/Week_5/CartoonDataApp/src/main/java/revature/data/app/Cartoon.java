package revature.data.app;

import java.util.Objects;

public class Cartoon{


    private int id;
    private String title;


    private String ogCreator;
    private int rating;
    private int category_id;

    public Cartoon() {
        super();
    }


    public Cartoon(int id, String title, String ogCreator, int rating, int category_id) {
        this.id = id;
        this.title = title;
        this.ogCreator = ogCreator;
        this.rating = rating;
        this.category_id = category_id;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOgCreator() {
        return ogCreator;
    }

    public int getRating() {
        return rating;
    }

    public int getCategory_id() {
        return category_id;

    }
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOgCreator(String ogCreator) {
        this.ogCreator = ogCreator;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cartoon cartoon = (Cartoon) o;
        return id == cartoon.id && rating == cartoon.rating && category_id == cartoon.category_id && title.equals(cartoon.title) && ogCreator.equals(cartoon.ogCreator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, ogCreator, rating, category_id);
    }
}

