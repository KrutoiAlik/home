package home02.javase01.task03;

import home02.javase01.task01.Pen;
import org.junit.jupiter.api.Test;

class NewbiePackageTest {

    NewbiePackage<Pen> pack = new NewbiePackage<>();
    Pen p1 = new Pen("YELLOW", "plast", false);
    Pen p2 = new Pen("CYAN", "plast", false);
    Pen p3 = new Pen("WHITE", "plast", false);

    @Test
    void add() {
        pack.add(p1);
    }

    @Test
    void set() {
        pack.add(p1);
        pack.set(p1, p2);
    }

    @Test
    void delete() {
        pack.add(p2);
        pack.delete(p2);
    }

    @Test
    void isContains() {
        pack.add(p1);
        pack.isContains(p2);
    }

    @Test
    void getPriceOfAll() {
        pack.getPriceOfAll();
    }

}