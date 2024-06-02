package level0;


public class P120923 {

    public static void main(String[] args) {
        
        int[] arr = solution(5, 15);
        for (int r : arr) {
            System.out.println(r);
        }
        
    }

    public static int[] solution(int num, int total) {
        int[] answer = {};
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        
        if (num == 1) return new int[]{total}; // num이 1인 경우
        int start = total / num - num;
        for (int i=start; i<total; i++) {
            int sum = 0;
            // 개수 : i+num-1
            for (int j=i; j<=i+num-1; j++) {
                sum += j;
                list.add(j);   
            }
            if (total == sum) {
                break;
            } else {
                sum = 0;
                list = new java.util.ArrayList<Integer>();
            }
        }
        
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}