package Solution1;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        //문제 들어오는 값

        String my_string = "people";

        sol.solution(my_string);
    }

    static class Solution {
        public String solution(String my_string) {
            String answer = "";
            // 중복된 문자제거
            // 중복되면 앞에있는 문자를 남기고 뒤에 있는걸 지움
            // 배열선언
            String[] strArr = new String[my_string.length()];
            // 배열에 문자를 전부 넣는다(공백 포함)
            for (int i = 0; i < my_string.length(); i++) {
                strArr[i] = String.valueOf(my_string.charAt(i));
            }
            System.out.println(Arrays.toString(strArr));
            //하나씩 추출해서 중복되는 수는 값을 받지 않도록
            // 이중포문쓰면 값을 지우는게 아니라서 중복된거 그대로 등장 i에서

            for (int i = 0; i < strArr.length; i++) {
                boolean a = false;
                for (int j = i + 1; j < strArr.length; j++) {
                    if(strArr[i].equals(strArr[j])) {
                        a = true;
                        break;
                    }
                }
                if(!a) {
                    answer += strArr[i];
                }

            }
            System.out.println(answer);
            return answer;
        }
    }

}

