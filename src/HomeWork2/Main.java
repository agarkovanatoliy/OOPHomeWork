package HomeWork2;

public class Main {
    public static void main(String[] args) {

        Human name = new Human();
        name.setName("Николай");

        Market market = new Market();

        market.update(name);
    }
}