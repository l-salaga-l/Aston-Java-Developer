package stage7.buider;

class Chef {
    public Pizza makeHawaiianPizza(PizzaSize size) {
        return new Pizza.PizzaBuilder(size)
                .addCheese()
                .addPineapples()
                .build();
    }

    public Pizza makeMargheritaPizza(PizzaSize size) {
        return new Pizza.PizzaBuilder(size)
                .addCheese()
                .addTomatoes()
                .addMushrooms()
                .build();
    }
    public Pizza makePepperoniPizza(PizzaSize size) {
        return new Pizza.PizzaBuilder(size)
                .addCheese()
                .addTomatoes()
                .addPepperoni()
                .build();
    }
}
