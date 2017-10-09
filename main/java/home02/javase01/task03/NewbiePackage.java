package home02.javase01.task03;

import home02.javase01.task04.Sortable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @task03 Используя созданную иерархию классов "Канцелярские товары" реализовать "Набор новичка".
 *
 * @param <T> - любой объект-наследник класса Chancery {@link Chancery} или он сам.
 * @interface {@link Sortable} - интерфейс с методами сортировки по наименованию {@link Sortable#sortByName()},
 *                                                                  стоимости {@link Sortable#sortByPrice()},
 *                                                                  стоимости и наименовании {@link Sortable#sortByPriceAndName()}
 *
 * @methods {@link #add(Chancery)}
 *          {@link #delete(Chancery)}
 *          {@link #set(Chancery, Chancery)}
 *          {@link #isContains(Chancery)}
 *          {@link #getPriceOfAll()} - стоимость всех канц. товаров в наборе
 */

public class NewbiePackage<T extends Chancery> implements Sortable {

    ArrayList<T> chancery = new ArrayList<>();

    void add(T t) {
        chancery.add(t);
    }

    void set(T out, T in) {
        delete(out);
        add(in);
    }

    void delete(T t) {
        if (chancery.contains(t))
            chancery.remove(t);
    }

    boolean isContains(T t) {
        return chancery.contains(t);
    }

    int getPriceOfAll() {
        return chancery.stream().mapToInt(Chancery::getPrice).sum();
    }

    @Override
    public void sortByName() {
        Collections.sort(chancery, Comparator.comparing(s -> s.getClass().getSimpleName()));
    }

    @Override
    public void sortByPrice() {
        Collections.sort(chancery, (ch1, ch2) -> ch1.compareTo(ch2));
    }

    @Override
    public void sortByPriceAndName() {
        Collections.sort(chancery, (ch1, ch2) -> ch1.compareBy2Args(ch2));
    }

    @Override
    public String toString() {
        return chancery.toString();
    }
}
