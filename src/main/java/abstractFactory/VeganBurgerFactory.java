package abstractFactory;

public class VeganBurgerFactory implements AbstractBurgerFactory{

    @Override
    public Burger createBurger() {
        return new VeganBurger(createMeat(), createSauce());
    }

    @Override
    public Meat createMeat() {
        return new SoyMeat();
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Salad createSalad() {
        return new Lettuce();
    }

    @Override
    public Sauce createSauce() {
        return new Ketchup();
    }
}
