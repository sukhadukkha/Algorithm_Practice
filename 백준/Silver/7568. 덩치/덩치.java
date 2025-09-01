import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2]; // 행이 N개, 열은 2개(몸무게,키)
        
        String[] s;
        for (int i = 0; i < N; i++) {
            s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if(i==j) continue; // 본인끼리는 비교 X
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { // 비교 대상이 자신보다 몸무게, 키 둘 다 크다면
                    rank++; // 순위 한단계 낮춤
                }
            }
            System.out.print(rank + " "); // 순위 출력
        }
    }
}
