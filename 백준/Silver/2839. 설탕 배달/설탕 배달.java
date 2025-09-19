import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];


        if (n >= 5) {
            dp[5] = 1;
        }

        if (n >= 3) {
            dp[3] = 1;
        }

        for (int i = 6; i <= n; i++) {
            if (i % 5 == 0) {
                dp[i] = dp[i - 5] + 1;
            } else if (i % 3 == 0) {
                dp[i] = dp[i - 3] + 1;
            } else {
                if (dp[i - 5] != 0 && dp[i - 3] != 0) {
                    dp[i] = Math.min(dp[i - 5], dp[i - 3]) + 1;
                }
            }
        }

        if (dp[n] == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(dp[n]);

    }
}




