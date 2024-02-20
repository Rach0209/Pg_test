package lv01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 자연수 뒤집어 배열로 만들기
 * 제출 내역
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 12345	[5,4,3,2,1]
 */
public class Test_008 {
    class Solution {
        public int[] solution(long n) {
            String[] arr = String.valueOf(n).split("");
            int[] answer = new int[arr.length];

            for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
                answer[i] = Integer.parseInt(arr[j]);
            }
            return answer;

        }

        public int[] solution2(long n) {
            String[] arr = String.valueOf(n).split("");
            List<String> temp = Arrays.asList(arr);
            Collections.reverse(temp);
            int[] answer2 = temp.stream().mapToInt(v -> Integer.parseInt(v)).toArray();
            return answer2;
        }
    }
}
