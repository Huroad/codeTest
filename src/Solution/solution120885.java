package Solution;

public class solution120885 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String bin1 = "0";
        String bin2 = "0";
        sol.solution(bin1, bin2);
    }
    //이진수 더하기
    static class Solution {
        public String solution(String bin1, String bin2) {
            String answer = "";
            String answer2 = "";
            // 2로 나눈 나머지가 1이면 1 0이면 0  2로 계속나눈다
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < bin1.length(); i++) {
                if(bin1.charAt(i) == '1') {
                    num1 = num1 * 2 + 1;
                } else if (bin1.charAt(i) == '0') {
                    num1 = num1 * 2;
                }
            }
            System.out.println(num1);
            for (int j = 0; j < bin2.length(); j++) {
                if(bin2.charAt(j) == '1') {
                    num2 = num2 * 2 + 1;
                } else if (bin2.charAt(j) == '0') {
                    num2 = num2 * 2;
                }
            }
            System.out.println(num2);

            int sum = num1 + num2;
            System.out.println(sum);
            if(sum != 0){
                 while(sum > 0) {
                    if(sum % 2 == 0) {
                        answer2 += '0';
                    } else if (sum % 2 == 1) {
                        answer2 += '1';
                    }
                     sum = sum / 2;
                 }
                StringBuilder answer1 = new StringBuilder(answer2);
                answer1.reverse();
                System.out.println(answer1.toString());
                answer = answer1.toString();
            } else if (sum == 0) {
                answer = "0";
            }
            System.out.println(answer);

            return answer;
        }
    }
}