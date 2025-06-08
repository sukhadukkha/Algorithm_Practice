import java.io.*;
import java.util.Arrays;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arrays = new int[n];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(arrays);

        for (int i = 0; i < arrays.length; i++) {
            bw.write(arrays[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}