package Solution;

public class solution120924 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] common = {1, 2, 3 , 4};

        sol.solution(common);
    }
    //다음에 올 숫자
    static class Solution {
        public int solution(int[] common) {
            int answer = 0;
            //등차인지 등비인지 구별
            int first = common[0];
            int second = common[1];
            int num = second - first;
            //등비수열은 0이 절대 올수가없음

            if (num == common[2] - second) {
                answer = num + common[common.length - 1];
            } else if(second / first != 0 && second / first == common[2] / second) {
                answer = (second / first) * common[common.length - 1];
            }
            System.out.println(answer);
            return answer;
        }
    }
}
