package HomeWork5;

import HomeWork5.model.AutomatHotDrinks;
import HomeWork5.model.Drink;
import HomeWork5.model.HotDrink;
import HomeWork5.presenter.AutomatPresenter;
import HomeWork5.view.DrinkVIEW;

public class Main {
    public static void main(String[] args) {

        DrinkVIEW drinkVIEW = new DrinkVIEW();

        drinkVIEW.drink("Coffee", 3, 90);
        drinkVIEW.drink("Tea", 4, 70);
        drinkVIEW.drink("Latte", 5, 60);

        drinkVIEW.allDrink();
        System.out.println("-".repeat(30));

        drinkVIEW.issuanceDrink("Tea");





    }

}