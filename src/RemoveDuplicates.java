import java.util.*;

/**
 * Задача №3
 * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 <T> Collection<T> removeDuplicates(Collection<T> collection)
 */
public class RemoveDuplicates {
    public static void main (String [] args){
        Collection <Integer> col = new ArrayList<>();
        col.add(1);
        col.add(3);
        col.add(7);
        col.add(1);
        col.add(7);

        for(int i: removeDuplicates(col)){
            System.out.println(i);
        }
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<T>(collection);
    }
}