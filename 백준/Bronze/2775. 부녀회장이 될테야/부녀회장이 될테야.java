
import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[][] apt = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1; // i층 1호는 모두 1명
            apt[0][i] = i; // 0층 i호는 모두 i명
        }

        for (int i = 1; i < 15; i++) {

            for (int j = 2; j < 15; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        // 1층 3호 ->  1+ 0층2호 + 0층 3호 - 1+2+3  --> 1층 2호(0층1호+0층2호)+0층3호

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(apt[k][n]);
        }
    }
}