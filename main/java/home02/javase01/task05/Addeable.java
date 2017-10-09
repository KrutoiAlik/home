package home02.javase01.task05;

import java.util.ArrayList;

public interface Addeable {

    default void addGraceIn(int grace, ArrayList<Integer> diary) {

    }

    default void addGraceIn(double grace, ArrayList<Double> diary){

    }
}
