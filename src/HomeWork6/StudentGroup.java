package HomeWork6;

import java.util.List;

public class StudentGroup<T extends User> {

    //region fields
    private String nameGroup;
    private List<T> group;
    //endregion

    //region construction
    public StudentGroup(String nameGroup, List<T> group) {
        this.nameGroup = nameGroup;
        this.group = group;
    }
    //endregion

    //region getters
    public String getNameGroup() {
        return nameGroup;
    }

    public List<T> getGroup() {
        return group;
    }
    //endregion

    //region methods
    public void addStudent(T user) {
        group.add(user);
    }

    public void removeStudent(T user) {
        group.remove(user);
    }

    //endregion
}
