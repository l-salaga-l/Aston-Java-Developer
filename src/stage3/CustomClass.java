package stage3;

import java.util.*;

public class CustomClass {

    private String name;
    private int age;

    public CustomClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return '{' + name + " : " + age + '}';
    }

    public static void main(String[] args) {
        List<CustomClass> list = new ArrayList<>();
        String[] names = {"Steve", "Andrew", "Alice", "Carl", "Max"};
        Random random = new Random();

        // Добавление объектов в список в случайном порядке
        for (int i = 0; i < 5; i++) {
            String name = names[random.nextInt(names.length)];
            int age = random.nextInt(43) + 18; // Возраст от 18 до 60
            list.add(new CustomClass(name, age));
        }

        System.out.println("Список до сортировки:");
        System.out.println(list);

        Comparator<CustomClass> sortByAge = new Comparator<CustomClass>() {
            @Override
            public int compare(CustomClass o1, CustomClass o2) {
                return o2.getAge() - o1.getAge();
            }
        };

        // Сортировка в обратном порядке по значению возраста
        Collections.sort(list, sortByAge);

        System.out.println("Список после сортировки в обратном порядке:");
        System.out.println(list);
    }
}

