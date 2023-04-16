package CustomArrayList;

import java.util.Comparator;

/**
 * Класс сортирующий алгоритмом QuickSort для коллекций типа Array
 */
public class CustomArraySorting {

    /**
     * @param arr коллекция передаваемая в этот метод для сортировки
     * @param <T> тип коллекции
     */
    public static <T extends Comparable<? super T>> void sort(Array<T> arr){
        quickSort(arr,0, arr.size()-1);
    }

    /**
     * @param arr коллекция передаваемая в этот метод для сортировки
     * @param c компаратор (условие как будет сортироваться коллекция)
     * @param <T> тип коллекции
     */
    public static <T> void sort(Array<T> arr, Comparator<T> c) {
        quickSort(arr,0, arr.size()-1,c);
    }

    /**
     * Метод рекурсивно вызывающий сам себя для разбиения на подмассивы для последующей сортирровки
     * @param arr принимаемая коллекция
     * @param begin индекс первого элемента подмассива
     * @param end индекс последнего элемента подмассива
     * @param <T> тип элементов в коллекции
     */
    private static <T extends Comparable<? super T>> void quickSort(Array<T> arr, int begin, int end){
        if(begin<end){
            int divideIndex = divide(arr,begin,end);
            quickSort(arr,begin,divideIndex-1);
            quickSort(arr,divideIndex,end);
        }
    }

    /**
     * В этом методе происходит сортировка слева от pivot помещаются элементы которые меньше его, справа которые больше
     * @param arr принимаемая коллекция
     * @param begin индекс первого элемента подмассива
     * @param end индекс последнего элемента подмассива
     * @return граница по которой нужно делить массив
     * @param <T> тип коллекции
     */
    private static <T extends Comparable<? super T>> int divide(Array<T> arr, int begin, int end){
        T pivot = arr.get(begin);
        while (begin<=end){

            while (arr.get(begin).compareTo(pivot)<0){
                begin++;
            }

            while (arr.get(end).compareTo(pivot)>0){
                end--;
            }

            if(begin<=end){
                T temp = arr.get(begin);
                arr.update(begin, arr.get(end));
                arr.update(end,temp);
                begin++;
                end--;
            }
        }
        return begin;
    }

    /**
     * Метод рекурсивно вызывающий сам себя для разбиения на подмассивы для последующей сортирровки
     * @param arr передаваемая коллекция
     * @param begin индекс первого элемента подмассивара
     * @param end индекс последнего элемента подмассива
     * @param c компаратор (правило по которому будет сортироваться коллекция)
     * @param <T> тип коллекции
     */
    private static <T > void quickSort(Array<T> arr, int begin, int end,Comparator<T> c){
        if(begin<end){
            int divideIndex = divide(arr,begin,end,c);
            quickSort(arr,begin,divideIndex-1,c);
            quickSort(arr,divideIndex,end,c);
        }
    }

    /**
     * В этом методе происходит сортировка слева от pivot помещаются элементы которые меньше его, справа которые больше
     * @param arr передаваемая коллекция
     * @param begin индекс первого элемента подмассива
     * @param end индекс последнего элемента подмассива
     * @param c компаратор (правило по которому будет сортироваться коллекция)
     * @return граница по которой нужно делить массив
     * @param <T> тип коллекции
     */
    private static <T> int divide(Array<T> arr, int begin, int end,Comparator<T> c){
        T pivot = arr.get(begin);
        while (begin<=end){

            while (c.compare(arr.get(begin),pivot)<0){
                begin++;
            }

            while (c.compare(arr.get(end),pivot )>0){
                end--;
            }

            if(begin<=end){
                T temp = arr.get(begin);
                arr.update(begin, arr.get(end));
                arr.update(end,temp);
                begin++;
                end--;
            }
        }
        return begin;
    }
}
