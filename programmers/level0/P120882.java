package level0;


public class P120882 {

    public static void main(String[] args) {
        
        int[] arr = solution(new int[][]{{80,70}, {80,70}, {90,50}, {40,70}, {50,80}});
        for (int r : arr) {
            System.out.println(r);
        }
    }

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] arr = new double[score.length];
        for (int i=0; i<score.length; i++) {
            arr[i] = (score[i][0]+score[i][1]) / 2.0;
        }
        for (int i=0; i<arr.length; i++) {
            int rank = 0;
            for (int j=0; j<arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    rank++;
                }
            }
            answer[i] = score.length-rank+1;
        }
        return answer;
    }
}