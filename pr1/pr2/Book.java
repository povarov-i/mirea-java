import java.util.Scanner;
public class Book {
    Scanner in = new Scanner(System.in);
    private String author;
    private String title;
    private String publisher;
    private int year;
    private int pages;

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

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        String s = "Автор: " + author + "\n" + "Название: " + title + "\n" + "Издатель: " + publisher + "\n" + "Год: " + year + "\n" + "Кол-во страниц: " + pages + "\n";
        return s;
    }
}
