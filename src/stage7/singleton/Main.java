package stage7.singleton;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        // Первый запрос к базе данных сохраняется в кэше
        System.out.println(database.query("SELECT * FROM users"));

        // Второй запрос тот же, но теперь он вернёт закэшированные данные
        System.out.println(database.query("SELECT * FROM users"));
    }
}
