public class Task2 {
    public static void main(String[] arg) {
        double[] arr = new double [10];
        double sum = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (double) 1 / i;
            System.out.println(arr[i]);
        }
        for (double j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }
}
