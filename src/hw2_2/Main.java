package hw2_2;
//Реализовать класс Market и все методы, которые он обязан реализовывать.
//        Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour –
//        помещает и удаляет человека из очереди, метод update – обновляет состояние магазина
//        (принимает и отдаёт заказы)

public class Main {
    public static void main(String[] args) {
        Market market = new Market("Bob","Order 1");
        market.joinToQueue();
        market.setName("Rut");
        market.joinToQueue();
        market.setName("Jon");
        market.joinToQueue();
        System.out.println("В очереди стоит " +  market.size() + " человек");

        System.out.println();

        market.update();
        market.leaveQueue();
        System.out.println("В очереди стоит " +  market.size() + " человек");

        market.update();
        market.leaveQueue();
        System.out.println("В очереди стоит " +  market.size() + " человек");




//        Market [] markets = new Market[2];
//        markets[0] = new Market("Bob","Order 1");
//        markets[1] = new Market("Rut","Order 2");

        //for(Market item : markets ){
//            //System.out.println("Покупатель " + item.getName() + " встал в очередь");
//            item.joinToQueue();
//            System.out.println("В очереди стоят " + item.size() + " человек");
//        }
//

//            System.out.println();
//            System.out.println("В очереди стоят " + markets.length + " человек");
//            System.out.println();
//
//        for(Market item : markets ){
//            //System.out.println(item.getName() + " сделал заказ " + item.getOrder());
//            item.placeOrder();
//            //System.out.println(item.getName() + " получил заказ " + item.getOrder());
//            item.takeOrder();
//            System.out.println("Покупатель " + item.getName() + " покинул очередь" );
//            item.leaveQueue();
//
//            System.out.println("В очереди стоят " + item.size() + " человек");
//            item.size();
////            System.out.println();
//
//        }
//        //System.out.println("В очереди стоят " + markets.length + " человек");


        System.out.println();}}













