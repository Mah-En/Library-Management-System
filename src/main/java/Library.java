import java.util.Map;
import java.util.*;
public class Library {
    public Library(){
        Scanner in = new Scanner(System.in);
        String userName,password;
        System.out.println("* Enter username:");
        userName = in.next();
        System.out.println("* Enter password:");
        password = in.next();
        Librarian newLibrarian = new Librarian(userName,password);
        this.addLibrarian(newLibrarian);
    }
    private ArrayList<Book> Books = new ArrayList<Book>();
    private ArrayList<User> Users = new ArrayList<User>();
    private ArrayList<Librarian> Librarians = new ArrayList<Librarian>();
    //book related functions
    private HashMap<String,Integer>BooksNumbers  = new HashMap<String, Integer>() {
    };

    public ArrayList<Book> getBooks() {
        return Books;
    }

    public void setBooks(ArrayList<Book> books) {
        Books = books;
    }

    public ArrayList<User> getUsers() {
        return Users;
    }

    public void setUsers(ArrayList<User> users) {
        Users = users;
    }

    public ArrayList<Librarian> getLibrarians() {
        return Librarians;
    }

    public void setLibrarians(ArrayList<Librarian> librarians) {
        Librarians = librarians;
    }

    public HashMap<String, Integer> getBooksNumbers() {
        return BooksNumbers;
    }

    public void setBooksNumbers(HashMap<String, Integer> booksNumbers) {
        BooksNumbers = booksNumbers;
    }

    public void addBook(String name,String author,int year,String isbn){
        Book newBook = new Book(name,author,year,isbn);
        Books.add(newBook);
        if(!BooksNumbers.containsKey(name)){
            BooksNumbers.put(newBook.getName(),1);
        }
        else{
            BooksNumbers.replace(newBook.getName(), BooksNumbers.get(newBook.getName())+1);
        }
        //TODO
    }

    public void removeBook(String name,String author,int year,String isbn){
        Book remBook = new Book(name,author,year,isbn);
//        Books.remove(remBook);
        if(BooksNumbers.get(remBook.getName())==0){
            System.err.println("This book doesn't exist:(");
            return;
        }
        BooksNumbers.replace(remBook.getName(), BooksNumbers.get(remBook.getName())-1);
        //TODO
    }

    public Book searchBook(String isbn){
        for (Book temp : Books){
            if(temp.getISBN().equals(isbn)){
                return temp;
            }
        }
        return null;
        //TODO
    }

    public void updateBook(String name,String author,int year,String isbn){
        Book updBook = new Book(name,author,year,isbn);
        for (int i = 0; i < Books.size(); i++){
            Book temp = Books.get(i);
            if(temp.getISBN()==updBook.getISBN()){
                Books.set(i,updBook);
            }
        }
        //TODO
    }

    public boolean doesBookExist(String name,String author,int year,String isbn){
        Book searchBook = new Book(name,author,year,isbn);
        for (Book temp : Books){
            if(temp.getName().equals(searchBook.getName())){
                return true;
            }
        }
        return false;
        //TODO
    }

    public void increaseBook(Book incBook, int num){
        BooksNumbers.replace(incBook.getName(), BooksNumbers.get(incBook.getName())+num);
        //TODO
    }

    public void decreaseBook(String name,String author,int year,String isbn,int num){
        Book decBook = new Book(name,author,year,isbn);
        BooksNumbers.replace(decBook.getName(), BooksNumbers.get(decBook.getName())-num);
        if(BooksNumbers.get(decBook.getName())<=0){
            BooksNumbers.remove(decBook.getName());
        }
        //TODO
    }

    //user related functions

    public void addUser(String username,String password){
        User newUser = new User(username,password);
        Users.add(newUser);
        //TODO
    }

    public void removeUser(String username,String password){
        User remUser = new User(username,password);
        Users.remove(remUser);
        //TODO
    }

    public User searchUser(String username, String password){
        User searchUser = new User(username,password);
        for(int i=0;i<Users.size();i++){
            User temp=Users.get(i);
            if(temp.getUserName()==searchUser.getUserName()){
                return temp;
            }
        }
        return null;
        //TODO
    }

    public void updateUser(String username,String password){
        User updUser = new User(username,password);
        for(int i=0;i<Users.size();i++){
            User temp=Users.get(i);
            if(temp.getUserName()==updUser.getUserName()){
                Users.set(i,temp);
            }
        }
        //TODO
    }

    public boolean doesUserExist(String username,String password){
        User searchUser = new User(username,password);
        for(User temp:Users){
            if(temp.getUserName().equals(searchUser.getUserName())){
                return true;
            }
        }
        return false;

        //TODO
    }

    //librarian related functions

    public void addLibrarian(Librarian newLibrarian){
        ArrayList<Librarian> temp= this.getLibrarians();
        temp.add(newLibrarian);
        this.setLibrarians(temp);
        //TODO
    }

    public void removeLibrarian(String username,String password){
        Librarian remLibrarian = new Librarian(username,password);
        Users.remove(remLibrarian);
        //TODO
    }

    public boolean searchLibrarian(String username,String password){
        Librarian search_Librarian = new Librarian(username,password);
        for(Librarian temp : this.getLibrarians()){
            if(temp.equals(search_Librarian)){
                return true;
            }

        }
        return false;
        //TODO
    }

    public void updateLibrarian(String username,String password){
        Librarian updLibrarian = new Librarian(username,password);
        for(int i=0;i<Librarians.size();i++){
            Librarian temp=Librarians.get(i);
            if(temp.getUserName()==updLibrarian.getUserName()){
                Librarians.set(i,temp);
            }
        }
        //TODO
    }

    public boolean doesLibrarianExist(Librarian search_librarian){
        for(Librarian temp : Librarians){
            if(temp.getUserName().equals(search_librarian.getUserName())){
                return true;
            }
        }
        return false;
        //TODO
    }
}
