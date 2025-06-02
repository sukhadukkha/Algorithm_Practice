import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 1; // 겹 수 (최소루트)
        int range = 2; // 범위 (최솟값 기준)

        if (n == 1) {
            System.out.println(1);
        } else {
            while (range <= n) { // 범위가 n보다 커지기 직전까지 반복
                range=range+(6*count); // 다음 범위의 최솟값으로 초기화
                count++; // count 1 증가
            }
            System.out.println(count);
        }
    }
}