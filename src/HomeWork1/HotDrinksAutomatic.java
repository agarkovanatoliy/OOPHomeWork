package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksAutomatic implements VendingAutomate{

    public List<HotDrink> newlist = new ArrayList<>();
    @Override
    public void initProduct(List<HotDrink> list) {
        this.newlist = list;
    }

    @Override
    public void getProduct(String name) {
        for (int i = 0; i < newlist.size(); i++) {
            if (newlist.get(i).getName().equals(name)){
                System.out.println(newlist.get(i));
            }
        }

    }
}
