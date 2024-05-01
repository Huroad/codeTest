package Solution120876;

public class Solution120923 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int num = 3;
        int total = 12;

        sol.solution(num, total);
    }

    static class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];
            //연속된 수의 합
            int mid = total / num - num / 2;
            for (int i = 0; i < num; i++) {
                if(num % 2 == 1) {
                    answer[i] = mid++;
                } else if (num % 2 == 0) {
                    answer[i] = mid++ + 1;
                }
            }
            System.out.println(answer);
            return answer;
        }
    }
}

