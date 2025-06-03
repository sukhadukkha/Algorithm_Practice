import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] num = new int[n];


        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
