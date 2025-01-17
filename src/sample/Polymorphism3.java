package sample;

public class Polymorphism3 {
    public static void main(String[] args) {
        TV2 tv2 = new TV2();
        
        PC pc = new PC();
        //Electrical pc2 = new PC(); これでも良い

        use(tv2);
        use(pc);
        //tv2.power();
        //pc.power();
    }

    public static void use(Electrial eleItem){
        eleItem.power();
    }
}
