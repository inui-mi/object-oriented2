package sample;

public class Sample {
    public static void main(String[] args) {
        // Car hoge = new Taxi(); //TaxiがCarをextendsしているから
        // Object fuga = new Taxi();

        // Electrial ele = new TV2(); //TVがElectricalをimplementsしているから
        //Electrial ele = new Electrial; これはできない

        Car car = new Taxi();
        car.stepOnAccele();;
    }
}
