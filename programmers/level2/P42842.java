package level2;

/*
 * 1 : 6
 * 2 : 10
 * 3 : 12
 * 4 : 14
 */

public class P42842 {
    public static void main(String[] args) {
        P42842 p = new P42842();
        int[] result = p.solution(24,24);
        System.out.println(result[0]+" "+result[1]);
    }

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown+yellow;
        for (int i=total/2; i>2; i--) { // 세로길이
            int j = total / i; // 가로길이
            //if (j >= i && total == i*j) {
            // 가로-2 * 세로-2 == yellow가 나와야함
            if (j >= i && total == i*j && (i-2)*(j-2) == yellow) {
                answer[0] = j;
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}
