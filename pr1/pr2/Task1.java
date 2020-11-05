import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ball ball = new Ball();
        System.out.println("Введите тип: " );
        ball.type = in.nextLine();
        System.out.println("Введите цвет: ");
        ball.color = in.nextLine();
        System.out.println("Введите диаметр: ");
        ball.diameter = in.nextInt();
        System.out.println(ball.toString());
    }
}
