package level0;

/**
 * Lession10
 */
public class P10 {

    public static void main(String[] args) {
        int[][] dots = {{1,1},{2,2},{3,3},{4,4}};
        int r = solution(dots);
        System.out.println(r);
    }

    public static int solution(int[][] dots) {
        

        int[][] arr = {{0,1, 2,3}, {0,2, 1,3}, {0,3, 1,2}};
        for (int i=0; i<arr.length; i++) {
            double diffX1 = dots[arr[i][0]][0] - dots[arr[i][1]][0];
            double diffY1 = dots[arr[i][0]][1] - dots[arr[i][1]][1];

            double diff1 = (double)diffY1 / diffX1;

            double diffX2 = dots[arr[i][2]][0] - dots[arr[i][3]][0];
            double diffY2 = dots[arr[i][2]][1] - dots[arr[i][3]][1];

            double diff2 = (double)diffY2 / diffX2;
            if (diff1 == diff2) return 1;
        }
        return 0;
    }
}