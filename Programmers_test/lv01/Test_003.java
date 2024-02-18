package lv01;

import java.util.Arrays;
import java.util.stream.LongStream;

/**
 * x만큼 간격이 있는 n개의 숫자
 * 제출 내역
 * 문제 설명
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 * 입출력 예
 * x	n	answer
 * 2	5	[2,4,6,8,10]
 * 4	3	[4,8,12]
 * -4	2	[-4, -8]
 */
public class Test_003 {
    public static void main(String[] args) {
        int x = -4;
        int n = 5;

        String solution1 = solution(x, n);
        String solution2 = solution2(x, n);
        System.out.println(solution1);
        System.out.println(solution2);
    }

    public static String solution(int x, int n) {
        long[] answer = new long[n];
        int sum = x;
        for (int i = 0; i < n; i++) {
            answer[i] = sum;
            sum += x;
        }
        return Arrays.toString(answer);
    }

    public static String solution2(int x, int n) {
        return Arrays.toString(LongStream.rangeClosed(1, n).map(v -> v *= x).toArray());
    }
}
