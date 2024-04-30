package Solution120956.src.Solution;

public class solution120921 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String A = "hello";
        String B = "llohe";

        sol.solution(A, B);
    }
    //문자열 밀기
    static class Solution {
        public int solution(String A, String B) {
            int answer = 0;
            //각 문자를 오른쪽으로 한칸씩 마지막 문자는 맨앞
            StringBuilder sb = new StringBuilder(A);
            if(A.equals(B)) {
                answer = 0;
            } else {
                for (int i = 1; i <= A.length(); i++) {
                    sb.insert(0, sb.charAt(sb.length() - 1));
                    sb.deleteCharAt(sb.length() - 1);
                    System.out.println(sb);
                    ;
                    if(sb.toString().equals(B)) {
                        answer = i;
                        break;
                    } else if(i == A.length()) {
                        answer = -1;
                    }
                }
            }
            System.out.println(answer);
            return answer;
        }
    }
}
