package HomeWork6;

public class User {

    //region fields
    String name;
    String surname;
    String patronymic;

    //endregion

    //region construction
    public User(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
    //endregion

    //region methods
    @Override
    public String toString() {
        return  name + ' ' +
                surname + ' ' +
                patronymic + ' ';
    }
    //endregion

    //region getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
    //endregion

}