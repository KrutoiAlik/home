package person_projects.fibonachi;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonachi {

    public static void main(String[] args) {
        fib(new Scanner(System.in).nextInt());
    }

    public static void fib(int i) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(0);
        for (int j = 1; j < i; j++) {
            if (j == 1) {
                integers.add(1);
                continue;
            }
            int tmp = integers.get(j - 1) + integers.get(j - 2);
            integers.add(tmp);
        }
        System.out.println(integers.toString());
    }
}