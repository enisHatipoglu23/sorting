import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin boutunu giriniz : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println((i+1) + ". Elemanı giriniz : ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
