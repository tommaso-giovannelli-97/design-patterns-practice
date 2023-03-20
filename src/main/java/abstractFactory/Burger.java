package abstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Burger {
    protected String name;
    protected List<String> ingredients = new ArrayList<>();

    public abstract void prepare();

    public void cook() {
        System.out.println("Cooking burger for 10 minutes");
    }

    public void box() {
        System.out.println("Putting burger in the box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
