package stage1;

public class Person {
    // Приватное поле
    private String name;

    // Приватный конструктор
    private Person(String name) {
        this.name = name;
    }

    // Статический фабричный метод
    public static Person CreatePerson(String name) {
        return new Person(name);
    }

    // Публичный метод для получения имени
    public String getName() {
        return name;
    }

    // Публичный метод для установки имени
    public void setName(String name) {
        this.name = name;
    }
}
