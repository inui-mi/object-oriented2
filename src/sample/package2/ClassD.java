package sample.package2;

import sample.package1.classA;

public class ClassD extends classA{
    public static void main(String[] args) {
        classA classA = new classA();

        classA.name = "ほげほげ";

        classA.method();
    }

    void classDmethod(){
        name = "ふがふが";
    }
}
