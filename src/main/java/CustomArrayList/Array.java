package CustomArrayList;

import java.util.List;

/**
 * @see CustomArray
 */
public interface Array<T> extends Iterable<T>  {

    /**
     * Добавление элемента в коллекцию
     * @param t элемент который нужно добавить в коллекцию
     */
    void add(T t);

    /**
     * Метод возвращающий элемент коллекции по его индексу
     * @param index индекс элемента в коллекции
     * @return возвращааемый элемент коллекции
     */
    T get(int index);

    /**
     * Метод удаляющий элемент коллекции по его индексу
     * @param index индекс элемента в коллекции, который мы хотим удалить
     */
    void delete(int index);

    /**
     * Метот изменения элемента коллекции по его индексу
     * @param index индекс элемента который нужно изметить
     * @param t значение которым заменяется значение элемента
     */
    void update(int index, T t);

    /**
     * возвращает количество элементов в коллекции
     * @return int значение указывающее количество элементов
     */
    int size();
}
