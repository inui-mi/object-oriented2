package sample;

public class Main {
    public static void main(String[] args) {
        
        Employee[] employees = {
            new Employee("山田", 200000),
            new Employee("海田", 220000),
            new Employee("川田", 240000)
        };

        //Employee[] employees = new Employee[3];


        // employees[0] = new Employee();
        // employees[0].setName("山田");
        // employees[0].setSalary(200000);

        // employees[1] = new Employee();
        // employees[1].setName("海田");
        // employees[1].setSalary(220000);

        // employees[2] = new Employee();
        // employees[2].setName("川田");
        // employees[2].setSalary(240000);

        Material[] materials = {
            new Material("金", 10000),
            new Material("銀", 5000),
            new Material("銅", 1000),
            new Material("木", 500),
            new Material("プラチナ", 20000)

        };

        // Material[] materials = new Material[4];

        // materials[0] = new Material();
        // materials[0].setName("金");
        // materials[0].setCost(10000);

        // materials[1] = new Material();
        // materials[1].setName("銀");
        // materials[1].setCost(5000);

        // materials[2] = new Material();
        // materials[2].setName("銅");
        // materials[2].setCost(1000);

        // materials[3] = new Material();
        // materials[3].setName("木");
        // materials[3].setCost(500);


        // MedalFactoryを作成
        MedalFactory factory = new MedalFactory(employees);

        Medal[] medals = factory.makeMedal(materials);  // 材料配列を渡してメダルを作成

        for (Medal medal : medals) {
            System.out.println("製品名：" + medal.getName() + "/ 価格：" + medal.getPrice() + "円");
        }
    }
}
