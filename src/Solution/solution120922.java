package Solution;

public class solution120922 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int M = 2;
        int N = 2;

        sol.solution(M, N);
    }
    // 종이 자르기
    // 가위로 자르는 횟수
    static class Solution {
        public int solution(int M, int N) {
            int answer = 0;
            if(M == 1 && N == 1) {
                answer = 0;
            } else {
                answer = M * N - 1;
            }
            System.out.println(answer);

            return answer;
        }
    }
}
