import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите автора: ");
        book.setAuthor(in.nextLine());

        System.out.println("Введите название: ");
        book.setTitle(in.nextLine());

        System.out.println("Введите издателя: ");
        book.setPublisher(in.nextLine());

        System.out.println("Введите год: ");
        book.setYear(in.nextInt());

        System.out.println("Введите кол-во страниц: ");
        book.setPages(in.nextInt());

        System.out.println(book.toString());
    }
}
