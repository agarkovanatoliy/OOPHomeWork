package HomeWork2;

public class Main {
    public static void main(String[] args) {
//        Human name = new Human();
//        name.setName("Aleksandr");
//
//        name.setMakeOrder();
//        name.setTakeOrder();
//        System.out.println(name);

        Human name = new Human();
        name.setName("Николай");

        Market market = new Market();

        market.update(name);
    }
}