package sample;

import java.util.ArrayList;

public class NewMedalFactory extends MedalFactory{

    public NewMedalFactory(Employee[] employees) {
        super(employees);  // 親クラスのコンストラクタを呼び出し
    }
    
    @Override
    public Medal[] makeMedal(Material[] materials){

        Medal[] medals = super.makeMedal(materials);

        ArrayList<Medal> medalList = new ArrayList<>();
        for (Medal medal : medals) {
            medalList.add(medal);
        }

        for (Material material : materials) {
            if (material.getName().equals("プラチナ")) {
                // 価格を Material クラスで設定された価格を使用
                int platinumPrice = material.getCost();  // Mainクラスで設定された価格
                Medal platinumMedal = new Medal("プラチナメダル", platinumPrice);
                medalList.add(platinumMedal);
                break;
            }
        }
        // リストを配列に変換して返す
        return medalList.toArray(new Medal[0]);
        //         medals[i].setName("プラチナメダル");
                
        //         int newPrice = material.getCost() + (int)((double)getTotalSalary() / materials.length * 1.2);
        //         medals[i].setPrice(newPrice);
        //     }
        // }

        // return medals;
    }
}
