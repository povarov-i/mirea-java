import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Enter radius: ");
        circle.setRadius(in.nextInt());
        System.out.println(circle.toString());
    }
}
