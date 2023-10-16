package HomeWork5.presenter;

import HomeWork5.model.HotDrink;

import java.util.List;

public interface view {
    void drink(String name, int val, int temp);
    void allDrink();
    void issuanceDrink(String name);

}