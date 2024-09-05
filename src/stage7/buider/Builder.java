package stage7.buider;

public interface Builder<T> {
    Builder<T> addCheese();
    Builder<T> addPepperoni();
    Builder<T> addMushrooms();
    Builder<T> addTomatoes();
    Builder<T> addPineapples();
    T build();
}
