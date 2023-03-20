package abstractFactory;

public class ClassicBurgerFactory implements AbstractBurgerFactory{
    @Override
    public Burger createBurger() {
        return new ClassicBurger(createMeat(), createCheese(), createSalad(), createSauce());
    }

    @Override
    public Meat createMeat() {
        return new Beef();
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
