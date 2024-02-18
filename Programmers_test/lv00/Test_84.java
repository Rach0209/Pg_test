package lv00;

import java.util.stream.IntStream;

/*
* 카운트 다운
문제 설명
정수 start와 end가 주어질 때, start에서 end까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ end ≤ start ≤ 50
입출력 예
start	end	result
10	3	[10, 9, 8, 7, 6, 5, 4, 3]
입출력 예 설명
입출력 예 #1

10부터 3까지 1씩 감소하는 수를 담은 리스트는 [10, 9, 8, 7, 6, 5, 4, 3]입니다.
* */
public class Test_84 {
    class Solution {
        public int[] solution(int start, int end) {
            return IntStream.iterate(start, i -> i - 1).limit(start - end + 1).toArray();
        }
    }
}
