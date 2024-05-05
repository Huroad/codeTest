package Solution;

import java.util.Arrays;

public class solution181833 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 6;

        sol.solution(n);
    }
    // 특별한 이차원 배열 1
    // n x n 크기의 이차원배열 arr을 return
    static class Solution {
        public int[][] solution(int n) {
            int[][] answer = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i == j) {
                        answer[i][j] = 1;
                    }
                }
                //System.out.println(Arrays.toString(answer[i]));
            }
            return answer;
        }
    }
}
