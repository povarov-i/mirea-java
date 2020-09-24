import java.util.Scanner;
public class Task4 {
    public static void main(String[] arg) {
        int rslt = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            rslt = rslt * i;
        }
        System.out.println(rslt);
    }
}
