package HomeWork1;

public abstract class HotDrink {
    protected String name;
    protected int volume;
    protected int cost;

    public HotDrink(String name, int volume, int cost) {
        this.name = name;
        this.volume = volume;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "Название='" + name + '\'' +
                ", Объём=" + volume +
                ", Цена=" + cost +
                '}';
    }
}
