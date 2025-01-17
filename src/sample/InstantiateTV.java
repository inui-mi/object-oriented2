package sample;

public class InstantiateTV {
    public static void main(String[] args) {
        
        TV sonyTV = new TV();
        sonyTV.changeChannel(5);

        TV sharpTV = new TV();
        sharpTV.changeChannel(13);
        // sharpTV.channel = 13; ← これはchaangeChannel()のエラー処理が無意味になる

    }
}
