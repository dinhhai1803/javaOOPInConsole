package JavaLab.Lab_3_Fruit_shop;

import java.util.ArrayList;

public class BuyerList extends Buyer {
    private ArrayList<Buyer> buyers;
    private String BProduce;
    private int BQuanlity;
    private int BPrice;
    private int BAmount;

    public BuyerList( String BPopduce, int BQuanlity, int BPrice, int BAmount){
        super(BPopduce, BQuanlity, BPrice, BAmount);
        buyers = new ArrayList<>();
    }

    public void add(String BPopduce, int BQuanlity, int BPrice, int BAmount){
        buyers.add(new Buyer(BPopduce, BQuanlity, BPrice, BAmount));
    }

}
