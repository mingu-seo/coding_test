package level2;

public class P43165 {
    public static void main(String[] args) {
        P43165 p = new P43165();
        // int result = p.solution(new int[]{1,1,1,1,1},3);
        int result = p.solution(new int[]{4,1,2,1},4);
        System.out.println(result);
    }
    int answer;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        return answer;
    }
    // 배열, 인덱스, 현재계산값, 목표값
    void dfs(int[] numbers, int index, int value, int target) {
        // System.out.println(value);
        if (index == numbers.length) {
            if (value == target) answer++;
            return;
        }
        dfs(numbers, index+1, value+numbers[index], target);
        dfs(numbers, index+1, value-numbers[index], target);
    }
}
