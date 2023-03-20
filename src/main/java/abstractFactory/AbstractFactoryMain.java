package abstractFactory;

public class AbstractFactoryMain {

    private AbstractBurgerFactory factory;

    public AbstractFactoryMain(AbstractBurgerFactory factory) {
        this.factory = factory;
    }

    public Burger createBurger() {
        return factory.createBurger();
    }

    public static void main(String[] args) {
        AbstractFactoryMain classicBurgerFactory = new AbstractFactoryMain(new ClassicBurgerFactory());
        Burger classicBurger = classicBurgerFactory.createBurger();
        classicBurger.prepare();

        AbstractFactoryMain vegetarianBurgerFactory = new AbstractFactoryMain(new VegetarianBurgerFactory());
        Burger vegetarianBurger = vegetarianBurgerFactory.createBurger();
        vegetarianBurger.prepare();

        AbstractFactoryMain veganBurgerFactory = new AbstractFactoryMain(new VeganBurgerFactory());
        Burger veganBurger = veganBurgerFactory.createBurger();
        veganBurger.prepare();
    }
}
