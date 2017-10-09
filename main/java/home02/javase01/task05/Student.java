package home02.javase01.task05;

import java.util.ArrayList;

public class Student<T> {

    String name = "name";

    public String getName() {
        return name;
    }

    ArrayList<T> diary = new ArrayList();

    public Student(String s) {
        this.name = s;
    }

    void viewDiary(){
        for (T t :
                diary) {
            System.out.print(t.toString() + " ");
        }
    }


}
