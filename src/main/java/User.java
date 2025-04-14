import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner in = new Scanner(System.in);
    private String UserName ;
    private String Password;
    private ArrayList<Book> Books;
    public User(String userName,String password){
        UserName = userName;
        Password = password;
        Books = new ArrayList<Book>();
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public ArrayList<Book> getBooks() {
        return Books;
    }
    public void setBooks(ArrayList<Book> books) {
        Books = books;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void rentBook(Book book){
        Books.add(book);
        //TODO
    }

    public void returnBook(Book book){
        Books.remove(book);
        //TODO
    }
}
