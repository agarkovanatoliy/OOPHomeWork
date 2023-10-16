package HomeWork5.view;

import HomeWork5.model.HotDrink;
import HomeWork5.presenter.AutomatPresenter;
import HomeWork5.presenter.view;

import java.util.List;

public class DrinkVIEW implements view{
    AutomatPresenter automatPresenter = new AutomatPresenter();


    @Override
    public void drink(String name, int val, int temp) {
        automatPresenter.creatDrink(name,val,temp);
    }

    @Override
    public void allDrink() {
        System.out.println(automatPresenter.allDrink());

    }

    @Override
    public void issuanceDrink(String name) {
        System.out.println(automatPresenter.getDrink(name));
    }
}