package abstractFactory;

public class VegetarianBurgerFactory implements AbstractBurgerFactory{

    @Override
    public Burger createBurger() {
        return new VegetarianBurger(createMeat(), createCheese(), createSalad(), createSauce());
    }

    @Override
    public Meat createMeat() {
        return new SoyMeat();
    }

    @Override
    public Cheese createCheese() {
        return new Cheddar();
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
