package level0;


public class P120883 {

    public static void main(String[] args) {
        String[] args1 = {"meosseugi1", "1234"};
        String[][] args2 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        String r = solution(args1, args2);
        
        System.out.println(r);
        
    }

    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for (int i=0; i<db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login";
                } else {
                    answer = "wrong pw";
                }
            }
        }
        return answer;
    }
}