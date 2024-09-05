package stage7.buider;

public class Pizza {

    private PizzaSize size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean tomatoes;
    private boolean pineapples;

    public Pizza (PizzaBuilder pizzaBuilder) {
        size = pizzaBuilder.size;
        cheese = pizzaBuilder.cheese;
        pepperoni = pizzaBuilder.pepperoni;
        mushrooms = pizzaBuilder.mushrooms;
        tomatoes = pizzaBuilder.tomatoes;
        pineapples = pizzaBuilder.pineapples;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                ", tomatoes=" + tomatoes +
                ", pineapples=" + pineapples +
                '}';
    }

    public static class PizzaBuilder implements Builder {
        private PizzaSize size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;
        private boolean tomatoes;
        private boolean pineapples;

        public PizzaBuilder(PizzaSize size) {
            this.size = size;
        }

        @Override
        public PizzaBuilder addCheese() {
            this.cheese = true;
            return this;
        }

        @Override
        public PizzaBuilder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        @Override
        public PizzaBuilder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        @Override
        public PizzaBuilder addTomatoes() {
            this.tomatoes = true;
            return this;
        }

        @Override
        public PizzaBuilder addPineapples() {
            this.pineapples = true;
            return this;
        }

        @Override
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
