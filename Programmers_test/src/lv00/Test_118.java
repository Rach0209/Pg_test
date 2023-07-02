import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
* 배열 회전시키기
문제 설명
정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
3 ≤ numbers의 길이 ≤ 20
direction은 "left" 와 "right" 둘 중 하나입니다.
입출력 예
numbers	direction	result
[1, 2, 3]	"right"	[3, 1, 2]
[4, 455, 6, 4, -1, 45, 6]	"left"	[455, 6, 4, -1, 45, 6, 4]
입출력 예 설명
입출력 예 #1

numbers 가 [1, 2, 3]이고 direction이 "right" 이므로 오른쪽으로 한 칸씩 회전시킨 [3, 1, 2]를 return합니다.
입출력 예 #2

numbers 가 [4, 455, 6, 4, -1, 45, 6]이고 direction이 "left" 이므로 왼쪽으로 한 칸씩 회전시킨 [455, 6, 4, -1, 45, 6, 4]를 return합니다.
* */
public class Test_118 {
    public static void main(String[] args) {
        String direction = "right";
        String direction2 = "left";
        int[] numbers = {1, 2, 3};
        int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};

        List<Integer> list = Arrays.stream(numbers2).boxed().collect(Collectors.toList());
        System.out.println(list);
        List<Integer> answer = new ArrayList<>();
        if (direction2.equals("right")) {
            answer.add(list.get(list.size() - 1));
            for (int i = 0; i < list.size() - 1; i++) {
                answer.add(list.get(i));
            }
            System.out.println(answer);
        } else {
            for (int i = 1; i < list.size(); i++) {
                answer.add(list.get(i));
            }
            answer.add(list.get(0));
            System.out.println(answer.stream().mapToInt(i -> i).toArray());
            for (int a : answer.stream().mapToInt(i -> i).toArray()) {
                System.out.println(a);
            }
        }
    }
    class Solution {
        public int[] solution(int[] numbers, String direction) {
            List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
            List<Integer> answer = new ArrayList<>();
            if (direction.equals("right")) {
                answer.add(list.get(list.size() - 1));
                for (int i = 0; i < list.size() - 1; i++) {
                    answer.add(list.get(i));
                }
            } else {
                for (int i = 1; i < list.size(); i++) {
                    answer.add(list.get(i));
                }
                answer.add(list.get(0));
            }
            return answer.stream().mapToInt(i -> i).toArray();
        }
    }
}
