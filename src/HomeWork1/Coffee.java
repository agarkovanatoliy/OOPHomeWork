package HomeWork1;

public class Coffee extends HotDrink {
    protected int temperature;

    public Coffee(String name, int volume, int cost, int temperature) {
        super(name, volume, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "Название='" + name + '\'' +
                ", Объём=" + volume +
                ", Температура=" + temperature +
                ", Цена=" + cost +
                '}';
    }
}
