package stage1;

public class User {
    private String username;
    private String password;

    static {
        System.out.println("1. Исполняется статический блок инициализации класса-родителя");
    }

    {
        System.out.println("3. Исполяется динамический блок инициализации класса-родителя");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("4. Исполняется конструктор класса-родителя");
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
