package sample;

public class Bus extends Car{

    void Bus(){
    }

    public void stepOnAccele() {
        speed += 10;  // 加速するごとに10km/h増加
        System.out.println("スピードが" + speed + "に増えました");
    }

    int price;

    // @Override
    // void stepOnAccele(){
    //     speed = speed + 10;
    //     System.out.println();
    // }
}
