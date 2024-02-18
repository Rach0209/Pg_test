package lv00;

/*
*제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string의 원소는 영소문자로 이루어져 있습니다.
1 ≤ index_list의 길이 ≤ 1,000
0 ≤ index_list의 원소 < my_string의 길이
입출력 예
my_string	index_list	result
"cvsgiorszzzmrpaqpe"	[16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]	"programmers"
"zpiaz"	[1, 2, 0, 0, 3]	"pizza"
입출력 예 설명
입출력 예 #1

예제 1번의 my_string에서 인덱스 3, 5, 6, 11, 12, 14, 16, 17에 해당하는 글자는 각각 g, o, r, m, r, a, p, e이므로 my_string에서 index_list에 들어있는 원소에 해당하는 인덱스의 글자들은 각각 순서대로 p, r, o, g, r, a, m, m, e, r, s입니다. 따라서 "programmers"를 return 합니다.
입출력 예 #2

예제 2번의 my_string에서 인덱스 0, 1, 2, 3에 해당하는 글자는 각각 z, p, i, a이므로 my_string에서 index_list에 들어있는 원소에 해당하는 인덱스의 글자들은 각각 순서대로 p, i, z, z, a입니다. 따라서 "pizza"를 return 합니다.
* */
public class Test_60 {
    class Solution {
        public String solution(String my_string, int[] index_list) {
            String answer = "";
            for (int i = 0; i < index_list.length; i++) {
                answer += my_string.charAt(index_list[i]);
            }
            return answer;
        }
    }
}
