package Solution;

public class solution120887 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int i = 10;
        int j = 50;
        int k = 5;

        sol.solution(i, j ,k);
    }
    // k의 개수
    static class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;
            // i 부터 j까지 k가 몇번 등장하는지
            String str = "";
            for(int a = i; a<= j; a++) {
                str += a;
            }

            for(int a = 0; a< str.length(); a++) {
                if(k == Integer.parseInt(String.valueOf(str.charAt(a)))) {
                    answer++;
                }
            }
            System.out.println(answer);

            return answer;
        }
    }
}
