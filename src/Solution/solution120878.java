package Solution;


public class solution120878 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int a = 11;
        int b = 22;
        sol.solution(a, b);
    }
    //유한소수 판별하기
    static class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            int a2 = a;
            int b2 = b;
            while (b2 != 0) {
                int temp = b2;
                b2 = a2 % b2;
                a2 = temp;
            }
            int num1 = a / a2;
            int num2 = b / a2;

            // 분모의 소인수가 2와 5만 존재해야한다
            while (num2 % 2 == 0) {
                num2 /= 2;
            }
            while (num2 % 5 == 0) {
                num2 /= 5;
            }

            if(num2 == 1) {
                answer = 1;
            } else {
                answer = 2;
            }
            return answer;
        }
    }
}