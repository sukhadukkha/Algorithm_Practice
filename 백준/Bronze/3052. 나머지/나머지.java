import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        boolean[] flag = new boolean[42];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            int i1 = num[i] % 42;
            flag[i1] = true;
        }
        int count = 0;
        for (int i = 0; i < 42; i++) {
            if (flag[i]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
