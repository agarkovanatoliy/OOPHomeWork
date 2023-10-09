package HomeWork3;

/*
 * Класс `StudentGroup` представляет учебную группу и содержит поля
 * `name` -название группы,
 * и `numberOfStudents` - количество студентов в группе.
 */

class StudentGroup implements Comparable<StudentGroup> {



    private String name;

    private int numberOfStudents;


    public StudentGroup(String name, int numberOfStudents) {

        this.name = name;

        this.numberOfStudents = numberOfStudents;

    }


    public String getName() {

        return name;

    }


    public int getNumberOfStudents() {

        return numberOfStudents;

    }

    /*
     * Метод `compareTo(StudentGroup otherGroup)` реализует метод
     * сравненияобъектов класса `StudentGroup` по количеству студентов.
     */
    public int compareTo(StudentGroup otherGroup) {

        return Integer.compare(this.numberOfStudents, otherGroup.numberOfStudents);

    }

    /*
     * Метод `toString()` возвращает строку с названием группы и количеством
     * студентов.
     */

    public String toString() {

        return "Group " + name + " (" + numberOfStudents + " students)";

    }


}