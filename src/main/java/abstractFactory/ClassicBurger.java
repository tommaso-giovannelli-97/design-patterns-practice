package abstractFactory;


public class ClassicBurger extends Burger {
    private Meat meat;
    private Cheese cheese;
    private Salad salad;
    private Sauce sauce;

    public ClassicBurger(Meat meat, Cheese cheese, Salad salad, Sauce sauce) {
        name = "Classic Burger";
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.sauce = sauce;
        ingredients.add(meat.getName());
        ingredients.add(cheese.getName());
        ingredients.add(salad.getName());
        ingredients.add(sauce.getName());
    }

    @Override
    public void prepare() {
        System.out.println("Preparing classic burger with " + String.join(", ", ingredients));
    }
}

