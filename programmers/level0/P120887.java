package level0;


public class P120887 {

    public static void main(String[] args) {
        int r = solution(1, 13, 1);
        
        System.out.println(r);
        
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;
        for (; i<=j; i++) {
            String is = String.valueOf(i);
            for (int i2=0; i2<is.length(); i2++) {
                if (String.valueOf(is.charAt(i2)).equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}