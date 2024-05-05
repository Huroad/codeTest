package Solution;

public class solution12909 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "())";

        sol.solution(s);
    }
    // 올바른 괄호
    static class Solution {
        boolean solution(String s) {
            boolean answer = true;
            int stack = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stack++;
                } else if (s.charAt(i) == ')') {
                    if(stack == 0) {
                        answer = false;
                        break;
                    }
                    stack--;
                }
            }
            if(stack != 0) {
                answer = false;
            }
            System.out.println(answer);
            return answer;
        }
    }
}
