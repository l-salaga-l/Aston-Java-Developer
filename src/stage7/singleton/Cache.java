package stage7.singleton;

import java.util.*;

public class Cache {
    // Хранилище для кэшированных данных
    private Map<String, Object> cacheMap;

    private Cache() {
        cacheMap = new HashMap<>();
    }

    private static final class InstanceHolder {
        private static final Cache instance = new Cache();
    }

    // Метод для получения единственного экземпляра класса
    public static Cache getInstance() {
        return InstanceHolder.instance;
    }

    // Метод для получения данных из кэша по ключу
    public Object get(String key) {
        return cacheMap.get(key);
    }

    // Метод для добавления данных в кэш с указанным ключом
    public void put(String key, Object value) {
        cacheMap.put(key, value);
    }

    // Метод для проверки наличия данных в кэше
    public boolean contains(String key) {
        return cacheMap.containsKey(key);
    }
}
