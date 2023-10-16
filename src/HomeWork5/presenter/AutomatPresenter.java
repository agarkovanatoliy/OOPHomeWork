package HomeWork5.presenter;

import HomeWork5.model.AutomatHotDrinks;
import HomeWork5.model.HotDrink;

import java.util.List;

public class AutomatPresenter {
    private Model model;
    private AutomatHotDrinks automatHotDrinks = new AutomatHotDrinks();
//    view view;

    public void creatDrink(String name, int val, int temp){
        automatHotDrinks.addDrink(name, val, temp);
    }

    public List<HotDrink> allDrink(){
        return automatHotDrinks.getList();
    }

    public HotDrink getDrink(String name){
        return automatHotDrinks.getProduct(name);
    }
}