
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arrList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arrList);

        for (int i : arrList) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);

    }
}
