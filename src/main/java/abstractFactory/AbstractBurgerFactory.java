package abstractFactory;

public interface AbstractBurgerFactory {
    Burger createBurger();
    Meat createMeat();
    Cheese createCheese();
    Salad createSalad();
    Sauce createSauce();
}
