package stage7.decorator;

class SimpleDatabase implements Database {
    @Override
    public void executeQuery(String query) {
        // Выполнение запроса к базе данных
        System.out.println("Executing query: " + query);
    }
}
