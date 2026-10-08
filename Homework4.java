import java.util.Scanner;

public class Homework4 {
    int gcd(int m, int n) {
        if (n == 0) { return m; }
        else { return gcd(n, m%n); }
    }

    public static void main(String[] args) {
        Homework4 h4 = new Homework4();
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 수를 입력하세요 : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = h4.gcd(a,b);

        System.out.printf("두 수의 최대공약수는 : %d 입니다.", c);
    }
}