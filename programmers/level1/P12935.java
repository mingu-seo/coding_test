package level1;

/**
 * Lesson12935
 */
public class P12935 {

    public static void main(String[] args) {
        int[] result = solution(new int[]{4,3,2,1});
        for (int r : result) {
            System.out.println(r);
        }
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int minIdx = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIdx = i;
            }
        }
        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            var list = new java.util.ArrayList<Integer>();
            for (int i=0; i<arr.length; i++) {
                if (i != minIdx) {
                    list.add(arr[i]);
                }
            }
            answer = list.stream().mapToInt(i->i).toArray();
        }
        
        return answer;
    }
}