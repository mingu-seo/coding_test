import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        int r = solution(new int[][]{{2,3},{1,7},{2,4},{3,5}}, 10);
        System.out.println(r);
    }

    public static int solution(int[][] request, int tickets) {
        int result = 0;
        Arrays.sort(request, new Comparator<int[]>() {
            @Override
            public int compare (int[] c1, int[] c2) {
                return c1[0] - c2[0];
            }
        });
        for (int i=0; i<request.length; i++) {
            System.out.println(request[i][0]+":"+request[i][1]);
            if (result+request[i][1] <= tickets) {
                result += request[i][1];
            }
        }
        return result;
    }
}