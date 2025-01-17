package sample;

public class PC implements Electrial{

    private boolean powerOn;

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    @Override
    public void power(){
        if (powerOn){
            System.out.println("PCの電源が切れました");
            powerOn = false;
        }else{
            System.out.println("設定ファイルを読み込んでいます");
            System.out.println("PCの電源が入りました");
            powerOn = true;

        }
    }
}
