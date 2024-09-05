package stage7.decorator;

public class DatabaseApp {
    public static void main(String[] args) {
        Database db = new SimpleDatabase();

        Database loggingDb = new LoggingDatabaseDecorator(db);
        loggingDb.executeQuery("SELECT * FROM users");

        Database cachingDb = new CachingDatabaseDecorator(loggingDb);
        cachingDb.executeQuery("SELECT * FROM users");
        cachingDb.executeQuery("INSERT INTO users (name) VALUES ('John Doe')");
    }
}
