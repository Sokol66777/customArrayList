package CustomArrayList;

import java.util.Iterator;

/**
 * Класс для перебора элементов коллекции по очереди и для функцианирования forEach на коллекции.
 */
public class ArrayIterator<T> implements Iterator<T> {

    /**
     * Это поле указывает на номер элемента в массиве
     */
    private int index = 0;

    /**
     * Массив который мы хотим перебрать с помощью forEach
     */
    private final T[] values;

    /**
     * Конструктор инициализирующий массив this.values
     * @param values массив которые принимает конструктор
     */
    public ArrayIterator(T[] values){
        this.values=values;
    }

    /**
     * Метод проверяет есть следующий элемент в массиве
     * @return возвращает true если в массиве есть следующий элемент, false если нет
     */
    @Override
    public boolean hasNext() {
        return index<values.length;
    }

    /**
     * Возвращает элемент массива при успешно пройденной проверки методом hasNext
     * @return возвращаемый элемент массива
     */
    @Override
    public T next() {
        return values[index++];
    }
}
