package lv00;

/*
*
34	3	0
입출력 예 설명
입출력 예 #1

98은 2의 배수이므로 1을 return합니다.
입출력 예 #2

32는 3의 배수가 아니므로 0을 return합니다.
* */
public class Test_58 {
    class Solution {
        public int solution(int num, int n) {
            return num % n == 0 ? 1 : 0;
        }
    }
}
