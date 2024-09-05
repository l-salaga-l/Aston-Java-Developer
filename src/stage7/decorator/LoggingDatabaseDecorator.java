package stage7.decorator;

class LoggingDatabaseDecorator extends DatabaseDecorator {
    public LoggingDatabaseDecorator(Database database) {
        super(database);
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Logging query: " + query);
        super.executeQuery(query); // Выполняем запрос
    }
}
