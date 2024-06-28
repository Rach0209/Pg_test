package lv01;

import java.util.Arrays;
import java.util.Collections;

/**
 * 정수 내림차순으로 배치하기
 * 제출 내역
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * <p>
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 118372	873211
 */
public class Test_011 {
    public static void main(String[] args) {
        long n = 118372;
        long answer1 = 873211;
        long answer = 0;
        Integer[] temp = Arrays.stream(String.valueOf(n).split("")).mapToInt(v -> Integer.valueOf(v)).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, Collections.reverseOrder());
        int num = temp.length;

        for (int i = 0; i < temp.length; i++) {
            answer += temp[i] * (long) Math.pow(10, num - 1);
            num -= 1;
        }
        System.out.println(answer);

//        String res = "";
//        Long.toString(n).chars().sorted().forEach(c -> res += Character.valueOf((char)c) + res);
    }
}
