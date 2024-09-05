package stage7.decorator;

abstract class DatabaseDecorator implements Database {
    protected Database decoratedDatabase;

    public DatabaseDecorator(Database database) {
        this.decoratedDatabase = database;
    }

    @Override
    public void executeQuery(String query) {
        decoratedDatabase.executeQuery(query); // Делегируем вызов базовому объекту
    }
}
