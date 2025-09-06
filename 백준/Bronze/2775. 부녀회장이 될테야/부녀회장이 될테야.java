
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {


    // 규칙: k층 n호 = (k층 n-1호) + (k-1층 n호)
    // DP 배열 apt[k][n] 미리 채워놓고 답만 출력
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[][] apt = new int[15][15];

        for (int i = 0; i < apt.length; i++) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }


    }
}

