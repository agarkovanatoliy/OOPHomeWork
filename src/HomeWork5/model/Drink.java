package HomeWork5.model;

import java.util.List;

public abstract class Drink {
    protected String nameDrink;
    protected int val;

    public Drink(String nameDrink, int val) {
        this.nameDrink = nameDrink;
        this.val = val;
    }

    public String getNameDrink() {
        return nameDrink;
    }

    public void setNameDrink(String nameDrink) {
        this.nameDrink = nameDrink;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}