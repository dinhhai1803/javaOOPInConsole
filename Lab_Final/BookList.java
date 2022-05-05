import java.util.ArrayList;

public class BookList{
    private ArrayList<Book> lBooks;

    public BookList(){
        this.lBooks = new ArrayList();
    }

    public boolean checkGenre(String[] list, String genre){
        for(String i : list){
            if(i.equals(genre))
                return true;
        }
        return false;
    }

    static int count = 1;
    public void addBook(){
        String title;
        String author;
        String genre;
        int price;
        String isbn;

        String[] genreList = {
            "Network",
            "AI",
            "Programming"
        };

        while(true){
            title = Inputter.inpString("Enter Title: ");
            author = Inputter.inpString("Enter Author: ");
            genre = Inputter.inpGener("Enter Genre: ");
            price = Inputter.inpInt("Enter Price: ");
            isbn = Inputter.inpISBN("Enter ISBN: ");

            this.lBooks.add(new Book(count, title, author, genre, price, isbn));
            count++;
            System.out.println("Successful");
            System.out.println();
            if(this.lBooks.size() >= 3){
                char check = Inputter.inpChar("Do you want to continute(Y/N)?");
                if(check != 'Y' && check != 'y'){
                    break;
                }
            }
        }
    }

    public ArrayList<Book> searchByPartOfTitle(String title){
        ArrayList<Book> subList = new ArrayList<>();
        for(Book i : this.lBooks){
            if(i.getTitle().contains(title)){
                subList.add(i);
            }
        }
        return subList;
    }

    public Book searchByTitle(String title){
        for(Book i : this.lBooks){
            if(i.getTitle().equals(title)){
                return i;
            }
        }
        return null;
    }

    public Book searchByID(int ID){
        for(Book i : this.lBooks){
            if(i.getID() == ID){
                return i;
            }
        }
        return null;
    }


    public void findBook(){
        String title = "";
        title = Inputter.inpString("Enter Title to find: ");
        ArrayList<Book> check = searchByPartOfTitle(title);
        if(check != null){
            System.out.println("Result: ");
            System.out.println("ID\tTitle\tAuthor\tGenre\tPrice\tISBN");
            for(Book i : check){
                System.out.println(i);
            }
        }
        else{
            System.out.println("This book does not exist");
        }
    }

    public void update(Book i){
        System.out.println("Please enter new information for update: ");
        i.setTitle(Inputter.inpString("Input Title: "));
        i.setAuthor(Inputter.inpString("Input Author: "));
        i.setGenre(Inputter.inpGener("Input Genre: "));
        i.setPrice(Inputter.inpInt("Input Price: "));
        i.setISBN(Inputter.inpISBN("Input ISBN: "));
        System.out.println("Update record Id " + i.getID() + " was successfully");
    }

    public void delete(Book i){
        this.lBooks.remove(i);
        System.out.println("Update record Id " + i.getID() + " was successfully");
    }

    public void update_Delete(){
        int ID = Inputter.inpInt("Enter ID: ");
        char check = Inputter.inpChar("Do you want to update(U) or delete(D) book?");
        Book find = searchByID(ID);
        if(find != null){
            if(check == 'U')
                update(find);
            if(check == 'D')
                delete(find);
        }else{
            System.out.println("This book does not exist");
        }
    }

    public void report(){
        if(this.lBooks.size() ==0)
            System.out.println("Do not have any book. Add Books first");
        else {
            System.out.println("ID\tTitle\tAuthor\tGenre\tPrice\tISBN");
            for(Book i : this.lBooks){
                System.out.println(i);
            }
        }
    }

}