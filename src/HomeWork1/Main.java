package HomeWork1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создать наследника реализованного класса ГорячийНапиток с
 * дополнительным полем int температура.
 * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
 * реализовать перегруженный метод getProduct(int name, int volume, int temperature),
 * выдающий продукт соответствующий имени, объёму и температуре
 * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
 * воспроизвести логику, заложенную в программе
 * 4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 */
public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Coffee("Эспрессо", 60, 90, 90);
        Coffee americano = new Coffee("Американо", 100, 100, 90);
        Coffee latte = new Coffee("Латте", 250, 120, 80);

        List<HotDrink> prodList = new ArrayList<>(List.of(espresso,americano,latte));

        HotDrinksAutomatic automat = new HotDrinksAutomatic();

        automat.initProduct(prodList);
        System.out.println(prodList);
        automat.getProduct("Американо");

    }

}

