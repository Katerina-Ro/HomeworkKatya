import java.util.*;
/**
 * Задача №4
 * Напишите метод, который получает на вход Map<K, V> и возвращает Map, где ключи и значения поменяны местами.
 * Так как значения исходной Map могут совпадать, то тип ключа в Map будет уже не K, а Collection<K>: Map<V, Collection<K>>
 */
public class Swapping {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, null);
        map.put(null, null);
        map.put(6, "три");
        map.put(3, "один");
        map.put(2, "два");
        map.put(9, "восемь");
        map.put(8, "четыре");
        map.put(11, "пять");
        map.put(4, "один");
        map.put(5, "три");
        map.put(10, null);

        for(Map.Entry <String, Collection<Integer>> iter: swapping(map).entrySet()){
            System.out.println(iter);

        }
    }

    public static <V, K> Map<V, Collection<K>> swapping(Map<K, V> map) {
        Map<V, Collection<K>> newMap = new HashMap<>();

        Set<V> setValue = new HashSet<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            Collection<K> newValues = new ArrayList<>(); // получаем новое значение newMap - коллекция типа K

            V newKey = entry.getValue(); // получаем новый ключ: если такого ключа нет в наборе, то происходит добавление в новую map с новым значением и новым ключом
            if (!setValue.contains(newKey)) {
                setValue.add(newKey);
                newValues.add(key);
                newMap.put(newKey, newValues);
            }
        }
        return newMap;
    }
}


