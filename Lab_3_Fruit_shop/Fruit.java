package JavaLab.Lab_3_Fruit_shop;

public class Fruit {
    private int fruitID;
    private String fruitName;
    private int price;
    private int quanlity;
    private String origin;

    public Fruit(){
        
    }

    public Fruit(int fruitID, String fruitName, int price, int quanlity, String origin){
        this.setFruitID(fruitID);
        this.setFruitName(fruitName);
        this.setPrice(price);
        this.setQuanlity(quanlity);
        this.setOrigin(origin);

        
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitID() {
        return fruitID;
    }

    public void setFruitID(int fruitID) {
        this.fruitID = fruitID;
    }

    @Override
    public String toString(){
        return fruitID + "\t\t  " + fruitName + "\t\t   " + origin + "\t   " + price + "$";
    }
}
