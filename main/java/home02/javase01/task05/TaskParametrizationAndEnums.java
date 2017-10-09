package home02.javase01.task05;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskParametrizationAndEnums {

    static ArrayList<GroupStudents> groups;

    public static void main(String[] args) {

        groups = initGroups();
        addStudents(searchSubject());
        setGraces(searchSubject());
    }

    private static void setGraces(GroupStudents group) {
        Student<?> student = searchStudent(group);
        if(student == null)
            throw new RuntimeException("Нету такого студента");
        if(group.subject.name().equals("MATHEMATICS"))
            System.out.println(1);
    }

    static Student searchStudent(GroupStudents group){

        System.out.println("Введите фамилию студента");
        for (Student s :
                group.journalOfGroup) {
            if(s.getName().equals(new Scanner(System.in).nextLine()))
                return s;
        }
        return null;
    }

    /**
     * Возвращает запрашиваемую группу по предмету
     * @experimental    необходимо додумать, данная вариация не очень мне нравится
     */
    static GroupStudents searchSubject(){
        System.out.println("Выберите предмет");
        EnumForSubjects.listSubjects();

        GroupStudents group = GroupStudents.getGroupBySubject(new Scanner(System.in).nextLine(), groups);

        if (group == null) {
            System.err.println("Данного предмета нету");
            System.exit(0);
        }
    }

    /**
     * Добавление студентов в группу
     * @experimental    необходимо додумать, данная вариация не очень мне нравится
     * @param group
     */
    private static void addStudents(GroupStudents group) {

        Scanner in = new Scanner(System.in);
        String string;

        System.out.println("Сколько учеников");
        int i = in.nextInt();

        while (i > 0) {
            System.out.println("Введите фамилию студента");
            string = in.nextLine();
            group.addStudent(new Student(string));
            i--;
        }
    }

    //Возвращает имя предмета группы
    static String nameSubject(GroupStudents gr) {
        return gr.subject.name();
    }

    //Создание групп (пустых) по предметам
    static ArrayList<GroupStudents> initGroups() {
        ArrayList<GroupStudents> journal = new ArrayList<>();
        for (EnumForSubjects e : EnumForSubjects.values())
            journal.add(new GroupStudents(e));
        return journal;
    }
}
