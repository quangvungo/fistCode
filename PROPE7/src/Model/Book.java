package Model;

import javax.xml.crypto.Data;

public class Book {
    private String BookID;
    private String Title;
    private String Author;
    private String Year;

    public Book() {
    }

    public Book(String bookID, String title, String author, String year) {
        BookID = bookID;
        Title = title;
        Author = author;
        Year = year;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String bookID) {
        BookID = bookID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    @Override

    public String toString() {
        return "Book{" +
                "BookID='" + BookID + '\'' +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Year='" + Year + '\'' +
                '}';
    }
}
