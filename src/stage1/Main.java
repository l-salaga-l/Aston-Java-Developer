package stage1;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        // Инициализация объекта Person через статический фабричный метод
        Person person = Person.CreatePerson("Andrew");

        // Доступ к публичному методу
        System.out.println("Name: " + person.getName());

        // Использование сеттера для изменения имени через рефлексию
        Field nameField = null;
        try {
            nameField = person.getClass().getDeclaredField("name");
            nameField.setAccessible(true); // Делаем приватное поле доступным
            nameField.set(person, "Bob"); // Устанавливаем новое значение
        }
        catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // Проверяем новое значение
        System.out.println("Updated Name: " + person.getName());
    }
}
