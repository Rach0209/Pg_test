import java.util.Scanner;

/**
 * [PCCE 기출문제] 2번 / 피타고라스의 정리
 * 문제 설명
 * 직각삼각형이 주어졌을 때 빗변의 제곱은 다른 두 변을 각각 제곱한 것의 합과 같습니다.
 *
 * 피타고라스.jpg
 *
 * 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때, 다른 한 변의 길이의 제곱, b_square 을 출력하도록 한 줄을 수정해 코드를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ a < c ≤ 100
 * 입출력 예
 * 입력 #1
 *
 * 3
 * 5
 * 출력 #1
 *
 * 16
 * 입력 #2
 *
 * 9
 * 10
 * 출력 #2
 *
 * 19
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * a2 = 9, c2 = 25 이므로 16을 출력합니다.
 * 입출력 예 #2
 *
 * a2 = 81, c2 = 100 이므로 19를 출력합니다.
 *
 * 디버깅(Debugging) 문제 안내
 * 디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
 * 1줄만 수정하여 버그를 고치세요.
 * 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
 */
public class Test_141 {
    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int c = sc.nextInt();

            // 수정 전
            // int b_square = c - a;

            // 수정 후
            int b_square = (int) (Math.pow(c, 2) - Math.pow(a, 2));

            System.out.println(b_square);
        }
    }
}
