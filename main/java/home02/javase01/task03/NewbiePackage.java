package home02.javase01.task03;

import home02.javase01.task01.Pen;
import home02.javase01.task04.Sortable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class NewbiePackage<T extends Chancery> implements Sortable {

    static NewbiePackage<Chancery> pack = new NewbiePackage<>();
    static Pen p1 = new Pen("YELLOW", "plast", false);
    static Pen p2 = new Pen("CYAN", "plast", false);
    static Pen p3 = new Pen("WHITE", "plast", false);

    public static void main(String[] args) {

        Pencil pncl1 = new Pencil();
        pncl1.setPrice(135);
        pack.add(pncl1);
        p1.setPrice(100);
        pack.add(p1);
        p2.setPrice(222);
        pack.add(p2);
        Pencil pncl = new Pencil();
        pncl.price = 41;
        pack.add(pncl);
        p3.setPrice(55);
        pack.add(p3);
        pack.toSString();
        System.out.println();

        pack.sortByPriceAndName();

        pack.toSString();
    }

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
        Collections.sort(chancery, (s1, s2) -> s1.getClass().getSimpleName().compareTo(s2.getClass().getSimpleName()));
    }

    @Override
    public void sortByPrice() {
        Collections.sort(chancery, (ch1, ch2) -> ch1.compareTo(ch2));
    }

    @Override
    public void sortByPriceAndName() {
        Collections.sort(chancery, (ch1, ch2) -> ch1.compareBy2Args(ch2));
    }

    void toSString() {
        for (Chancery chancery :
                chancery) {
            System.out.println(chancery.getClass().getSimpleName());
        }
    }
}
