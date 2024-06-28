package lv01;

/**
 * 하샤드 수
 * 제출 내역
 * 문제 설명
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 1 이상, 10000 이하인 정수입니다.
 * 입출력 예
 * x	return
 * 10	true
 * 12	true
 * 11	false
 * 13	false
 * 입출력 예 설명
 * 입출력 예 #1
 * 10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.
 *
 * 입출력 예 #2
 * 12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.
 *
 * 입출력 예 #3
 * 11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.
 *
 * 입출력 예 #4
 * 13의 모든 자릿수의 합은 4입니다. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아닙니다.
 *
 * ※ 공지 - 2023년 5월 27일 문제 지문 오탈자 수정되었습니다.
 *
 *
 * 10	true
 * 12	true
 * 11	false
 * 13	false
 */
public class Test_012 {
    public static void main(String[] args) {
        int x = 10;
        int x2 = 11;
        int sum = 0;
        String[] temp = String.valueOf(x2).split("");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        System.out.println(sum);

        boolean answer = x2 % sum == 0;
        System.out.println(answer);




    }
}
