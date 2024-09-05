package stage7.decorator;

class CachingDatabaseDecorator extends DatabaseDecorator {
    public CachingDatabaseDecorator(Database database) {
        super(database);
    }

    @Override
    public void executeQuery(String query) {
        if (isCached(query)) {
            System.out.println("Returning cached result for query: " + query);
        } else {
            super.executeQuery(query); // Выполняем запрос, если его нет в кэше
            cacheResult(query); // Сохраняем результат в кэш
        }
    }

    private boolean isCached(String query) {
        // Логика для проверки, закэширован ли запрос (здесь просто имитация)
        return query.contains("SELECT * FROM users"); // Предположим, что запрос к пользователям всегда кэшируется
    }

    private void cacheResult(String query) {
        // Логика для кэширования результатов (имитация)
        System.out.println("Caching result for query: " + query);
    }
}
