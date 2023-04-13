package CustomArrayList;

import java.util.Iterator;

/**
 * Коллекция реализующая интерфейс Array
 * @param <T> тип элементов в этой коллекции
 */
public class CustomArray <T> implements Array<T>{

    /**
     * Кассив элементов
     */
    private T[] values;

    /**
     * Конструктор без параметров создающий массив дженерик типа
     */
    CustomArray(){
        this.values=(T[]) new Object[0];
    }

    /**
     * Добавление элемента в коллекцию
     * @param t элемент который нужно добавить в коллекцию
     */
    @Override
    public void add(T t) {


        T[] temp = this.values;
        this.values = (T[]) new Object[temp.length+1];
        System.arraycopy(temp,0,this.values,0,temp.length);
        this.values[this.values.length-1] = t;

    }

    /**
     * Получение элемента по индексу
     * @param index индекс элемента в коллекции
     * @return возвращает элемент по указанному индексу
     */
    @Override
    public T get(int index) {
        return this.values[index];
    }

    /**
     * Удаление элемента по индексу
     * @param index индекс элемента в коллекции, который мы хотим удалить
     */
    @Override
    public void delete(int index) {

        T[] temp = this.values;
        this.values = (T[]) new Object[temp.length-1];
        System.arraycopy(temp,0,values,0,index);
        int numMoved = temp.length-index-1;
        System.arraycopy(temp,index+1,values,index,numMoved);
    }

    /**
     * Изменение элемента по индексу
     * @param index индекс элемента который нужно изметить
     * @param t значение которым заменяется значение элемента
     */
    @Override
    public void update(int index, T t) {
        this.values[index] = t;
    }

    /**
     * возвращает размер коллекции
     * @return int значение указывающее размер коллекции
     */
    @Override
    public int size() {
        return this.values.length;
    }


    /**
     * Этот метод используется для инициализации итератора и последующего его использования
     * @return возвращает итератор с переданным в него массивом элементов
     */
    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(this.values);
    }
}
