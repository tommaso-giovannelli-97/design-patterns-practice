package abstractFactory;

public class VeganBurger extends Burger {
    private Meat meat;
    private Sauce sauce;

    public VeganBurger(Meat meat, Sauce sauce) {
        name = "Vegan Burger";
        this.meat = meat;
        this.sauce = sauce;
        ingredients.add(meat.getName());
        ingredients.add(sauce.getName());
    }

    @Override
    public void prepare() {
        System.out.println("Preparing vegan burger with " + String.join(", ", ingredients));
    }
}