package stage4;

import java.util.*;
import java.util.stream.Collectors;

class CustomClass {
    private String name;
    private List<Integer> numbers;

    public CustomClass(String name, List<Integer> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "CustomClass{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<CustomClass> list = new ArrayList<>(Arrays.asList(
                new CustomClass("a", Arrays.asList(1, 2, 3)),
                new CustomClass("b", Arrays.asList(2, 3, 4)),
                new CustomClass("c", Arrays.asList(1, 3, 4)),
                new CustomClass("d", Arrays.asList(2, 3, 5))
            )
        );
        Set<String> result = list.stream().sorted(Comparator.comparing(CustomClass::getName).reversed())
                .flatMap(customClass -> customClass.getNumbers().stream().map(num -> "Element: " + num))
                .collect(Collectors.toSet());

        System.out.println(result);

        List<String> list1 = Arrays.asList("one", "two", "three");
        list1.forEach(System.out::println);
    }
}
