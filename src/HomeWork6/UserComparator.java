package HomeWork6;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    //region methods
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSurname().compareTo(o2.getSurname());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getName().compareTo(o2.getName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
    //endregion
}