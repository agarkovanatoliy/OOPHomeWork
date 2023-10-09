package HomeWork3;

/*
 * представляет поток студентов и содержит поле`streamNumber` - номер потока,
 * и список `groups` - список учебных групп,представленных объектами класса `StudentGroup`.
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class StudentStream implements Iterable<StudentGroup> {



    private int streamNumber;

    private List<StudentGroup> groups;



    public StudentStream(int streamNumber) {

        this.streamNumber = streamNumber;

        this.groups = new ArrayList<>();

    }

    /*
     * Метод `addGroup(StudentGroup group)` добавляет группу в список групп потока.
     */

    public void addGroup(StudentGroup group) {

        this.groups.add(group);

    }

    /*
     * Метод `getStreamNumber()` возвращает номер потока, а метод `getGroups()`
     * возвращает список групп.
     */

    public int getStreamNumber() {

        return streamNumber;

    }



    public List<StudentGroup> getGroups() {

        return groups;

    }

    /*
     * Интерфейс `Iterable` был реализован, поэтому в классе `StudentStream`
     *  былреализован метод `iterator()`,
     * который возвращает итератор для списка групп.
     */

    public Iterator<StudentGroup> iterator() {

        return groups.iterator();

    }



}