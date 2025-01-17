package sample;

public class InstantiateTaxi2 {
    public static void main(String[] args) {
        
        Taxi taxi = new Taxi();
        taxi.speed = 10;
        taxi.price = 1000;
        taxi.stepOnAccele();
        taxi.payment();
    }
}
