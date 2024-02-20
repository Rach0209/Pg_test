package lv00;

import java.util.Scanner;

/*
* 짝 구분하기
문제 설명
자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ n ≤ 1,000
입출력 예
입력 #1

100
출력 #1

100 is even
입력 #2

1
출력 #2

1 is odd
※ 2023년 05월 15일 지문이 수정되었습니다.
* */
public class Test_82 {
    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(n % 2 == 0 ? n + " is even" : n + " is odd");
            sc.close();
        }
    }
}