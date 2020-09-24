import java.util.Scanner;
public class Task3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Dog[] dogs = new Dog[3];
        for(int i = 0; i < dogs.length; i++) {
            System.out.println("Введите породу Собаки " + (i + 1) + ": ");
            String tempBreed = in.nextLine();
            System.out.println("Введите цвет Собаки " + (i + 1) + ": ");
            String tempColor = in.nextLine();
            System.out.println("Введите возраст Собаки " + (i + 1) + ": ");
            int tempAge = in.nextInt();
            in.nextLine();
            dogs[i] = new Dog(tempBreed, tempAge, tempColor);
        }
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }
    }
}
