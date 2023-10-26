package HomeWork5.model;

import HomeWork5.presenter.Model;

import java.util.ArrayList;
import java.util.List;

public class AutomatHotDrinks implements Model {
    private List<HotDrink> list = new ArrayList<>();

    public List<HotDrink> getList() {
        return list;
    }

    public AutomatHotDrinks() {
    }

    @Override
    public HotDrink getProduct(String name) {
        for (HotDrink drinks:list) {
            if(drinks.getNameDrink().equals(name)){
                return drinks;
            }
        }
        return null;
    }

    @Override
    public void addDrink(String name, int val, int temp) {
        list.add(new HotDrink(name,val,temp));
    }

}