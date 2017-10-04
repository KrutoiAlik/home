package home02.javase01.task03;

import home02.javase01.task04.Sortable;

import java.util.*;

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
        else
            throw new NoSuchElementException();
    }

    boolean isContains(T t) {
        return chancery.contains(t);
    }

    int getPriceOfAll() {
        int sum = 0;
        for (T t :
                chancery) {
            sum += t.getPrice();
        }
        return sum;
    }


    @Override
    public void sortByName() {
        for (int i = 0; i < chancery.size(); i++) {
            for (int j = 0; j < chancery.size(); j++) {
                if (chancery.get(j).getClass().getSimpleName().compareTo(chancery.get(i).getClass().getSimpleName()) >= 0)
                    continue;
                else {
                    T tmp = chancery.get(i);
                    chancery.set(i, chancery.get(j));
                    chancery.set(j, tmp);
                }
            }
        }
    }

    @Override
    public void sortByPrice() {
        for (int i = 0; i < chancery.size(); i++) {
            for (int j = 0; j < chancery.size(); j++) {
                if (chancery.get(i).price >= chancery.get(j).price)
                    continue;
                else {
                    T tmp = chancery.get(i);
                    chancery.set(i, chancery.get(j));
                    chancery.set(j, tmp);
                }
            }
        }
    }

    @Override
    public void sortByPriceAndName() {

    }
}
