import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 목표 지점인 V에서 마지막 날(도착해서 B만큼 떨어지지 않는 날)을 빼주면 V-A
        int day = (V - A) / (A - B); // N일동안 A-B만큼 올라가고, 마지막 A만큼 더 올라가면 정상 N(A-B)+A = V


        // “나누어떨어지지 않는다” = 목표 높이 V - A까지 몫만큼의 날 수로는 도달할 수 없다는 뜻, 그래서 하루를 더 더해야 한
        if ((V - A) % (A - B) != 0) {
            day++;
        }

        System.out.println(day + 1);





    }
}