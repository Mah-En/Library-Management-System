import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library library = new Library();
        runMenu(library);
    }

    public static void runMenu(Library library){
        while(true) {
            System.out.println("* Enter your Command\n" + "1)I'm an User" + " 2)I'm a Librarian" + " 3) Exit");
            Scanner in = new Scanner(System.in);
            int cmd = in.nextInt();
            if (cmd == 1) {//User
                System.out.println("* Enter your Command\n" + "1) login" + " 2) logout" + " 3) Exit");
                cmd = in.nextInt();
                if (cmd == 1) {//login
                    String username, password;
                    System.out.println("* Enter username : ");
                    username = in.next();
                    System.out.println("* Enter password : ");
                    password = in.next();
                    User user = new User(username, password);
                    if (!library.doesUserExist(username, password)) {
                        System.out.println("New User!");
                        library.addUser(username, password);
                    }
                    System.out.println("1) borrow books" + " 2) return books");
                    cmd = in.nextInt();
                    if (cmd == 1) {//borrow
                        ShowMenu(library);
                        String name, author, isbn;
                        int year;
                        System.out.println("* Enter name , author , year and ISBN of book respectively :");
                        name = in.next();
                        author = in.next();
                        year = in.nextInt();
                        isbn = in.next();
                        Book newBook = new Book(name, author, year, isbn);
                        if (!library.doesBookExist(name, author, year, isbn)) {
                            System.err.println("This book doesn't exist!");
                        }
                        else {
                            library.removeBook(name, author, year, isbn);
                        }
                    } else if (cmd == 2) {//return
                        String name, author, isbn;
                        int year;
                        System.out.println("* Enter name , author , year and ISBN of book respectively :");
                        name = in.next();
                        author = in.next();
                        year = in.nextInt();
                        isbn = in.next();
                        Book newBook = new Book(name, author, year, isbn);
                        library.addBook(name, author, year, isbn);
                    }
                } else if (cmd == 2) {//logout
                    String username, password;
                    System.out.println("* Enter username : ");
                    username = in.next();
                    System.out.println("* Enter password : ");
                    password = in.next();
                    library.removeUser(username, password);
                }
                else if(cmd==3){//Exit
                    return ;
                }
            }
            else if (cmd == 2) {//Librarian
                System.out.println("* Enter your Command\n" + "1) login" + " 2) logout " + " 3) Exit");
                cmd = in.nextInt();
                if (cmd == 1) {//login
                    String username, password;
                    System.out.println("* Enter username : ");
                    username = in.next();
                    System.out.println("* Enter password : ");
                    password = in.next();
                    Librarian newlibrarian = new Librarian(username, password);
                    if (!library.doesLibrarianExist(newlibrarian)) {
                        System.err.println("No such Librarian!");
                        break;
                    }
                    System.out.println("1) add books" + " 2) remove books" + "3) Exit");
                    cmd = in.nextInt();
                    if (cmd == 1) {//add
                        String name, author, isbn;
                        int year;
                        System.out.println("* Enter name , author , year and ISBN of book respectively :");
                        name = in.next();
                        author = in.next();
                        year = in.nextInt();
                        isbn = in.next();
                        Book newBook = new Book(name, author, year, isbn);
                        if (!library.doesBookExist(name, author, year, isbn)) {
                            System.out.println("New Book added!");
                            library.addBook(name, author, year, isbn);
                        }
                        else {
                            library.increaseBook(library.searchBook(isbn), 1);
                            System.out.println("The number of book increased");
                        }
                    }
                    else if (cmd == 2) {//remove
                        String name, author, isbn;
                        int year;
                        System.out.println("* Enter name , author , year and ISBN of book respectively :");
                        name = in.next();
                        author = in.next();
                        year = in.nextInt();
                        isbn = in.next();
                        Book newBook = new Book(name, author, year, isbn);
                        if (!library.doesBookExist(name, author, year, isbn)) {
                            System.err.println("This book doesn't exist");
                        } else {
                            library.removeBook(name, author, year, isbn);
                        }
                    }
                    else if(cmd==3){//Exit
                        return ;
                    }
                }
                else if (cmd == 2) {//logout
                    String username, password;
                    System.out.println("* Enter username : ");
                    username = in.next();
                    System.out.println("* Enter password : ");
                    password = in.next();
                    library.removeLibrarian(username, password);
                }
            }
            else if (cmd == 3) {//exit
                return;
            }
        }
        //TODO:
    }

    public static void ShowMenu(Library library){
        ArrayList<Book> Books = library.getBooks();
        HashMap<String,Integer> nums = library.getBooksNumbers();
        int cnt=1;
        for(Book temp : Books){
            if(nums.get(temp.getName())>0){
                ToString(temp,cnt);
                cnt++;
            }
        }
        if(cnt==0){
            System.err.println("There is no book:(");
        }
    }
    public static void ToString(Book book, int cnt){
        System.out.println(cnt + ") "+" Name: "+book.getName() + " , Author: "+book.getAuthor() + " , Year: "+book.getYear() + " , ISBN: "+book.getISBN());
    }

}
