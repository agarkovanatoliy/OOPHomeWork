package HomeWork5.presenter;

import HomeWork5.model.HotDrink;

import java.util.List;

public interface Model {
    HotDrink getProduct(String name);
    void addDrink(String name, int val, int temp);
    List<HotDrink> getList();

}