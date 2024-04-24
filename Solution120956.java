package Solution120956;

import java.util.Arrays;

public class Solution120956 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        sol.solution(babbling);
    }
    //옹알이(1)
    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            // aya, ye, woo ,ma 가 나온 개수
            String[] meosseugi = {"aya", "ye", "woo", "ma"};
            // 머슥이의 값을 찾아서 변환
            for (int i = 0; i < babbling.length; i++) {
                for (int j = 0; j < meosseugi.length; j++) {
                    // 공백으로 바꿔준다
                    babbling[i] = babbling[i].replace(meosseugi[j], " ");
                }
            }
            System.out.println(Arrays.toString(babbling));
            // 문자열의 앞뒤의 공백을 제거한 값만 찾아서 answer을 증가
            for (int i = 0; i < babbling.length; i++) {
               if (babbling[i].trim().equals("")) {
                   answer++;
               }
            }
            System.out.println(answer);
            return answer;
        }
    }
}
