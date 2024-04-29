package Solution120876;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class solution120876 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] lines = {{0, 5}, {0, 5}, {0, 5}};
        sol.solution(lines);
    }

    static class Solution {
        public int solution(int[][] lines) {
            int answer = 0;
           List<Integer> arrlist = new ArrayList<>();
            for (int i = 0; i < lines.length; i++) {
                for (int j = lines[i][0]; j < lines[i][1]; j++) {
                    arrlist.add(j + 1);
                }
            }
            Collections.sort(arrlist);
            System.out.println(arrlist);

            for (int i = 0; i < arrlist.size(); i++) {
                int cnt = 0;
                // 여기서 j = i로 설정하지 않으면 이미 비교한값을 다시한번 비교함
                for (int j = i; j < arrlist.size(); j++) {
                    if(arrlist.get(i) == arrlist.get(j) && i != j) {
                        arrlist.remove(j);
                        cnt += 1;
                    }
                }
                System.out.println(cnt);
                if(cnt > 0) {
                    answer += 1;
                }
            }
            System.out.println(arrlist);
            System.out.println(answer);
            return answer;
        }
    }
}