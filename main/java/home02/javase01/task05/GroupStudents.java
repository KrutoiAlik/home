package home02.javase01.task05;

import sun.security.jgss.GSSCaller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GroupStudents {

    EnumForSubjects subject;
    Set<Student> journalOfGroup = new HashSet<>();

    public GroupStudents(EnumForSubjects subject) {
        this.subject = subject;
    }

    void addStudent(Student student){
        journalOfGroup.add(student);
    }

    static GroupStudents getGroupBySubject(String s, ArrayList<GroupStudents> groups){

        for (GroupStudents gr : groups) {
            if(TaskParametrizationAndEnums.nameSubject(gr).equals(s)){
                return gr;
            }
        }

        return null;
    }

    boolean isContains(Student student){
        return journalOfGroup.contains(student);
    }
}
