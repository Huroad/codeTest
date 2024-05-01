package Solution;

public class solution120883 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        sol.solution(id_pw, db);
    }
    //로그인 성공?
    static class Solution {
        public String solution(String[] id_pw, String[][] db) {
            String answer = "fail";
            // 아이디와 비번이 맞으면 login
            //아이디가 일치하지 않으면 fail
            // 비밀번호 일치하지 않으면 wrong pw
            String id = id_pw[0];
            String pw = id_pw[1];
            int[] cnt = new int[db.length];
            for (int i = 0; i < db.length; i++) {
                if(db[i][0].equals(id)) {
                    if (db[i][1].equals(pw)) {
                        cnt[i] = 2;
                    } else {
                        cnt[i] = 1;
                    }
                } else {
                    cnt[i] = 0;
                }
            }

            for (int i = 0; i < cnt.length; i++) {
                if(cnt[i] == 2) {
                    answer = "login";
                    break;
                } else if (cnt[i] == 1) {
                    answer = "wrong pw";
                }
            }

            return answer;
        }
    }
}