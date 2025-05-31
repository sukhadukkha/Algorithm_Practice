import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int n = Integer.parseInt(br.readLine());

        String[] s = new String[n];

        for(int i=0; i<n; i++) {
            s[i] = br.readLine();
        }

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 단어 길이가 같은경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(s[0]).append("\n");

        for(int i=1; i<n; i++) {
            // 중복되지 않는 단어만 출력
            if (!s[i].equals(s[i - 1])) {
                sb.append(s[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}