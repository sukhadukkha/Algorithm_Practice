import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();
        // 1 2 3 4 5 6 -> 2 3 4 5 6 -> 3 4 5 6 2 -> 4 5 6 2 -> 5 6 2 4 -> 6 2 4 -> 2 4 6 -> 4 6 -> 6 4 -> 6  == 4

        for (int i = N - 1; i >= 0; i--) {
            stack.push(N);
            N--;
        }

        while (stack.size() != 1) {
            stack.pop();
            Integer peek = stack.peek();
            stack.addLast(peek);
            stack.pop();
        }

        Integer peek = stack.peek();
        System.out.println(peek);
        
    }
}




