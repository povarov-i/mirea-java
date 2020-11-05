public class Task3 {
    public static void main(String[] arg) {
        int t = 0;
        int[] arr = new int[10];
        int lngth = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < lngth - 1; i++) {
            for (int j = 0; j < lngth - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
