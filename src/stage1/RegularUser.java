package stage1;

public class RegularUser extends User{
    static {
        System.out.println("2. Исполняется статический блок инициализации класса-наследника");
    }

    {
        System.out.println("5. Исполняется динамический блок инициализации класса-наследника");
    }

    public RegularUser(String username, String password) {
        super(username, password);
        System.out.println("6. Исполняется конструктор класса-наследника");
    }
}
