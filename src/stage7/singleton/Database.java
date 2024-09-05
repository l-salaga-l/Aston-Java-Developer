package stage7.singleton;

public class Database {
    private Cache cache;

    public Database() {
        this.cache = Cache.getInstance();
    }

    public Object query(String sql) {
        // Проверяем, есть ли результат запроса в кэше
        if (cache.contains(sql)) {
            System.out.println("Returning cached result for: " + sql);
            return cache.get(sql);
        }

        // Имитация логики выполнения запроса к базе данных
        Object result = executeDatabaseQuery(sql);

        // Сохраняем результат в кэше
        cache.put(sql, result);
        return result;
    }

    private Object executeDatabaseQuery(String sql) {
        System.out.println("Executing query: " + sql);
        return "Result for: " + sql;
    }
}
