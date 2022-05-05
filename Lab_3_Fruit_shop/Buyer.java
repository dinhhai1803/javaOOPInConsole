package JavaLab.Lab_3_Fruit_shop;

public class Buyer {
    private String BName;
    private String BProduce;
    private int BQuanlity;
    private int BPrice;
    private int BAmount;

    public Buyer(){

    }

    public Buyer( String BPopduce, int BQuanlity, int BPrice, int BAmount){
        this.BProduce = BPopduce;
        this.BQuanlity = BQuanlity;
        this.BPrice = BPrice;
        this.BAmount = BAmount;
    }

    public int getBAmount() {
        return BAmount;
    }

    public void setBAmount(int bAmount) {
        this.BAmount = bAmount;
    }

    public int getBPrice() {
        return BPrice;
    }

    public void setBPrice(int bPrice) {
        this.BPrice = bPrice;
    }

    public int getBQuanlity() {
        return BQuanlity;
    }

    public void setBQuanlity(int bQuanlity) {
        this.BQuanlity = bQuanlity;
    }

    public String getBProduce() {
        return BProduce;
    }

    public void setBProduce(String bProduce) {
        this.BProduce = bProduce;
    }

    public String getBName() {
        return BName;
    }

    public void setBName(String bName) {
        this.BName = bName;
    }

    public String toString(){
        return  BProduce + "   " + BQuanlity + "   " + BPrice + "$   " + BAmount;
    }
}
