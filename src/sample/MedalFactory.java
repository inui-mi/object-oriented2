package sample;

import java.util.ArrayList;

public class MedalFactory {

    private Employee[] employees;

    
    public MedalFactory(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    private int getTotalSalary(){
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;

    }


    public Medal[] makeMedal(Material[] materials) {
        ArrayList<Medal> medals = new ArrayList<>();
        int totalSalary = getTotalSalary();
        int numberOfMedals = materials.length;

        for (Material material : materials){
            int price;
            String medalType = "";

            if (material.getName().equals("金")) {
                medalType = "金メダル";

            }else if (material.getName().equals("銀")){
                medalType = "銀メダル";

            }else if (material.getName().equals("銅")){
                medalType = "銅メダル";

            }else{
                medalType = "不良品";
                price = 0;
            }

            if (!medalType.equals("不良品")){
                price = material.getCost() + (int)((double)totalSalary / numberOfMedals * 1.2);
            }else{
                price = 0;
            }

            Medal medal = new Medal(medalType, price);
            medals.add(medal);

        }
        return medals.toArray(new Medal[0]);
    }
}
