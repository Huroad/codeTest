package Solution120876;

import java.util.Arrays;

public class solution120876 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        sol.solution(lines);
    }

    static class Solution {
        public int solution(int[][] lines) {
            int answer = 0;
            int a1 = lines[0][0];
            int a2 = lines[0][1];
            int b1 = lines[1][0];
            int b2 = lines[1][1];
            int c1 = lines[2][0];
            int c2 = lines[2][1];

            int[] aArr = arr(a1, a2);
            int[] bArr = arr(b1, b2);
            int[] cArr = arr(c1, c2);
            System.out.println(Arrays.toString(aArr));
            System.out.println(Arrays.toString(bArr));
            System.out.println(Arrays.toString(cArr));



            return answer;
        }
        public int[] arr(int x, int y) {
            int[] Arr;
            if(x < 0) {
                if(y < 0) {
                    Arr = new int[Math.abs(Math.abs(x) - Math.abs(y)) + 1];
                }else {
                    Arr = new int[Math.abs(Math.abs(x) + Math.abs(y)) + 1];
                }
            } else {
                Arr = new int[Math.abs(Math.abs(x) - Math.abs(y)) + 1];
            }
            for (int i = 0; i < Arr.length; i++) {
                Arr[i] += x + i;
            }
            return Arr;
        }
    }
}

