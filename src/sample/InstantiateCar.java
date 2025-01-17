package sample;

public class InstantiateCar {
    public static void main(String[] args) {
        Car estima = new Car();

        //estima.speed = 30; できない
        estima.setSpeed(30);
        estima.setName("エスティマ");

        //System.out.println("スピードは" + estima.speed);　できない
        System.out.println("スピードは" + estima.getSpeed());
        System.out.println("車名は" + estima.getSpeed());
    }
}
