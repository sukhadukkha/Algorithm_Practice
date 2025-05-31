

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String[] str = new String[num];

        for (int i = 0; i < num; i++) {
            str[i] = scanner.next();
        }

        for (int i = 0; i < num; i++) {
            int count = 0;
            int score = 0;
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O') {
                    count++;
                    score += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}
