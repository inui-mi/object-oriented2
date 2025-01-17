package sample;

public class Zoo {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];

        animals[0] = new Sheep();
        animals[1] = new Horse();
        animals[2] = new Goat();
        animals[3] = new Monkey();
        animals[4] = new Bear();

        for (Animal animal : animals) {
            animal.cry();
        }
    }
}
