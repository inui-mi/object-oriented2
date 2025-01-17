package sample;

public class Taxi extends Car{

    int price;

    void payment(){
        System.out.println("料金を" + price + "円支払いました");
        price = 0;
    }

    @Override
    public void stepOnAccele(){
        speed = speed + 10;
        System.out.println("スピードが" + speed + "km/hに増えました");

        price = price + 90;
        System.out.println("料金が" + price + "円に増えました");
    }
}
