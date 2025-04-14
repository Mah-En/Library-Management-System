import java.util.Scanner;

public class Book {
    Scanner in = new Scanner(System.in);
    private String Name;
    private String Author;
    private int Year;
    private String ISBN;
    public Book(String name,String author,int year,String isbn) {
        //initialize
        Name=name;
        Author=author;
        Year=year;
        ISBN=isbn;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public void setYear(int year) {
        Year = year;
    }
    public void setISBN(String isbn) {
        ISBN = isbn;
    }

    public String getName() {
        return Name;
    }
    public String getAuthor() {
        return Author;
    }
    public int getYear() {
        return Year;
    }
    public String getISBN() {
        return ISBN;
    }
}
