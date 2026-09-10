import java.util.Scanner;

class Homework1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int num = 0; num < 5; num++) {

            System.out.print("정수를 입력하세요: ");

            int intg = sc.nextInt();

            sum += intg;

            System.out.printf("현재까지 입력된 정수의 합은 %d%n", sum);
        }

        sc.close();
    }
}