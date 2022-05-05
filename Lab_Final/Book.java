
public class Book {
    private int ID;
    private String title;
    private String author;
    private String genre;
    private int price;
    private String ISBN;

    public Book(int ID, String title, String author, String genre, int price, String ISBN){
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.ISBN = ISBN;
    }
    
    public int getID() {
        return ID;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        this.ISBN = iSBN;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setID(int iD) {
        this.ID = iD;
    }

    public String toString() {
        return this.ID + "\t" + this.title + "\t" + this.author + "\t" + this.genre + "\t" + this.price + "\t" + this.ISBN + "\t" ;
    }
    
}