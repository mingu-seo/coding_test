package level1;

/**
 */
public class P131705 {

    public static void main(String[] args) {
        int arr = solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println(arr);
    }

    public static int solution(int[] number) {
        int answer = 0;
        for (int i=0; i<number.length-2; i++) {
            for (int j=i+1; j<number.length-1; j++) {
                for (int k=j+1; k<number.length; k++) {
                    //System.out.println(i+" "+j+" "+k);
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}