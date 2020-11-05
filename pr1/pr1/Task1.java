import java.util.Scanner;
public class Task1 {
    public static void main(String[] arg) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println(sum);
    }
}
