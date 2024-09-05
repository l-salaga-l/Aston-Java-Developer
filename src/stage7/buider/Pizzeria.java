package stage7.buider;

public class Pizzeria {
    public static void main(String[] args) {
        Chef chef = new Chef();

        Pizza pepperoniPizza = chef.makePepperoniPizza(PizzaSize.SMALL);
        System.out.println(pepperoniPizza);

        Pizza margheritaPizza = chef.makeMargheritaPizza(PizzaSize.MEDIUM);
        System.out.println(margheritaPizza);
    }
}
