package HomeWork2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{
    private List <Actor> orders = new ArrayList<>();
    private Queue<Actor> que = new ArrayDeque<>();
    @Override
    public void acceptToMarket(Actor actor) {
        orders.add(actor);
        System.out.println(actor.getName() + " зашел в магазин");
    }
    @Override
    public void takeInQueue(Actor actor) {
        que.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        que.peek().isTakeOrder();
        System.out.println(que.peek().getName() + " сделал заказ");

    }

    @Override
    public void giveOrders() {
        que.peek().isMakeOrder();
        System.out.println(que.peek().getName() + " забрал заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(que.peek().getName() + " покинул очередь");
        que.poll();
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        orders.remove(actor);
        System.out.println(actor.getName() + " вышел из магазина");
    }
    @Override
    public void update(Actor actor) {
        acceptToMarket(actor);
        takeInQueue(actor);
        takeOrders();
        giveOrders();
        releaseFromQueue();
        releaseFromMarket(actor);
    }
}