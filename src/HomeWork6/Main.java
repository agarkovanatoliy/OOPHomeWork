/**
 * Взять реализованный код в рамках семинара 4 и продемонстрировать
 * применение принципов, усвоенных на семинаре.(SOLID)
 * Нужно в проекте прокомментировать участки кода,
 * которые рефакторим, какой принцип применяем и почему.
 */



package HomeWork6;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> list1 = new ArrayList<>();
        StudentGroup<User> group1 = new StudentGroup("Group1", list1);

        User student1 = new User("George", "Washington", "Alexandrovich");
        User student2 = new User("James", "Bond", "Viktorovich");
        User student3 = new User("John", "Aow", "Igorevich");

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);

        UserComparator<User> userComparator = new UserComparator<>();
        TreeSet<User> sortedGroup = new TreeSet<>(userComparator);
        for (User l: group1.getGroup()) {
            System.out.println(l);
            sortedGroup.add(l);
        }

        System.out.println(sortedGroup);

    }
}