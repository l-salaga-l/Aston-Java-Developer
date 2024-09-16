package stage3;

import java.util.*;

public class Main {
//    static class Class1 {
//        private String name;
//
//        public Class1(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return name;
//        }
//    }
//
//    static class Class2 extends Class1 {
//
//        public Class2(String name) {
//            super(name);
//        }
//    }

    public static void main(String[] args) {
        List<String> modifiableList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        List<String> unmodifiableList = List.copyOf(modifiableList);
        modifiableList.add("a");

        System.out.println(modifiableList);
        System.out.println(unmodifiableList);

//        List<Class2> list = new ArrayList<>();
//        list.add(new Class2("a"));
//        getList(list);
    }

//    static void getList(List<? super Class2> list) {
//        Object a = list.get(0);
//        System.out.println(a);
//    }
}
