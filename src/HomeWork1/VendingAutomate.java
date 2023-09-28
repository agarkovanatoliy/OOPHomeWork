package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public interface VendingAutomate {
    public List<HotDrink> newlist = new ArrayList<>();

    public void initProduct(List<HotDrink> list);
    public void getProduct(String name);
}
