package data;

import validate.Validation;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    ArrayList<Books> book = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    public boolean checkDuplicated(String id) {
        for (Books books : book) {
            if (id.equalsIgnoreCase(books.getId())) {
                System.out.println("Id Duplicated");
                return false;
            }
        }
        return true;
    }

    public void addBook() {
        String id, title, author, genre, isbn;
        int price;
        boolean flag = true;
        String option;
        do {
            do {
                id = Validation.getId("Enter Book ID: ", "ID can not empty ", "ID must be in format", "[B|b]\\d{1,4}$");
                flag = this.checkDuplicated(id);
            } while (!flag);
            title = Validation.getString("Enter Title: ", "Enter Title again: ");
            author = Validation.getString("Enter Author name: ", "Enter Author Name again: ");
            genre = Validation.getGenre("Enter Genre: ", "Genre can not empty ", "(There are only three genre: Network, AI, Programming", "^Network|AI|Programing$");
            price = Validation.getInt("Enter price: ", "Enter price again: ", 10, 1000000);
            System.out.println("Please input ISBN flow\n" +
                    "• xxxxx-xx-xx-x\n" +
                    "• xxxx-x-xxxx-x\n" +
                    "• xxx-xxx-xxx-x\n" +
                    "• xx-xxxxxx-x-x\n" +
                    "• xx-xxx-xxxx-x");
            isbn = Validation.getIsbn("Enter ISBN: ", "ISBN can not empty ", "ISBN must be in format", "(^\\d{4}[-]\\d{2}[-]\\d{2}[-]\\d{1}$)|(^\\d{4}[-]\\d{1}[-]\\d{4}[-]\\d{1}$)|(^\\d{3}[-]\\d{3}[-]\\d{3}[-]\\d{1}$)|(^\\d{2}[-]\\d{6}[-]\\d{1}[-]\\d{1}$)|(^\\d{2}[-]\\d{3}[-]\\d{4}[-]\\d{1}$)");
            option = Validation.getOption("Do you to add more: ", "Y or N");
        } while (option.equalsIgnoreCase("Y"));
    }

    public void upAndDel() {
        System.out.println("Do you want to update (U) or delete (D) book ?: ");
        if (sc.nextLine().equalsIgnoreCase("D")) {
            System.out.println("------- Delete Book --------\n" +
                    "Enter Code: ");
            String fId = sc.nextLine();
            for (int i = 0; i < book.size(); i++) {
                if (fId.equalsIgnoreCase(book.get(i).getId())) {
                    book.remove(i);
                    System.out.println("Delete Id "+fId+" Successfully");
                    return;
                }
            }
            System.out.println("Not found!");
        } else if (sc.nextLine().equalsIgnoreCase("U")) {
            boolean flag = true;
            String temp;

            System.out.println("--------- Update Book----\n" +
                    "Enter Code:");
            String fId = sc.nextLine();
            for (int i = 0; book.size() > i; i++) {
                if (fId.equalsIgnoreCase(book.get(i).getId())) {
                    do {
                        temp = Validation.getId("Enter Book ID: ", "ID can not empty ", "ID must be in format", "[B|b]\\d{1,4}$");
                        flag = this.checkDuplicated(temp);
                    } while (!flag);
                    book.get(i).setId(temp);
                    book.get(i).setTitle(Validation.getString("Enter new Title: ", "Enter Title again: "));
                    book.get(i).setAuthor(Validation.getString("Enter new Author name: ", "Enter Author Name again: "));
                    book.get(i).setPrice(Validation.getInt("Enter new price: ", "Enter price again: ", 10, 1000000));
                    book.get(i).setGenre(Validation.getGenre("Enter new Genre: ", "Genre can not empty ", "(There are only three genre: Network, AI, Programming", "^Network|AI|Programing$"));
                    System.out.println("Please input ISBN flow\n" +
                            "• xxxxx-xx-xx-x\n" +
                            "• xxxx-x-xxxx-x\n" +
                            "• xxx-xxx-xxx-x\n" +
                            "• xx-xxxxxx-x-x\n" +
                            "• xx-xxx-xxxx-x");
                    book.get(i).setIsbn(Validation.getIsbn("Enter ISBN: ", "ISBN can not empty ", "ISBN must be in format", "(^\\d{4}[-]\\d{2}[-]\\d{2}[-]\\d{1}$)|(^\\d{4}[-]\\d{1}[-]\\d{4}[-]\\d{1}$)|(^\\d{3}[-]\\d{3}[-]\\d{3}[-]\\d{1}$)|(^\\d{2}[-]\\d{6}[-]\\d{1}[-]\\d{1}$)|(^\\d{2}[-]\\d{3}[-]\\d{4}[-]\\d{1}$)"));
                    System.out.println("Update Id "+fId+" Successfully");
                }
            }
        }
    }

    public void findBook(){
        System.out.println("------- Find-------");
        System.out.println("Enter Title: ");
        String fTitle= sc.nextLine();
        String header= String.format("|%-5s|%-10s|%-15s|%-12s|%-10s|%-15s|","ID", "Title", "Author", "Genre", "Price", "ISBN");
        System.out.println(header);
        for (int i = 0; i < book.size(); i++){
            if (fTitle.equalsIgnoreCase(book.get(i).getTitle()))
                System.out.println(book.get(i));
        }
    }

        public void getInfomationBook() {
            System.out.println("--------------------Display ALL BOOK---------------------");
            for (int i = 0; book.size() > i; i++) {
                System.out.println(book.get(i));
            }
        }
}