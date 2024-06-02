package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P154539 {
    public static void main(String[] args) {
        P154539 p = new P154539();
        int[] result = p.solution(new int[] { 9, 1, 5, 3, 6, 2 });
        for (int r : result) {
            System.out.println(r);
        }
    }

    // 리스트로 하니까 에러나네 스택으로 바꿔보자
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = -1;
        }
        Stack<Integer> list = new Stack<>(); // 값담을 공간
        for (int i = numbers.length - 1; i >= 0; i--) { // 뒤에서 가까운 큰값이므로 뒤에서부터 시작
            // list에 값이 있고, 마지막값보다 numbers값이 크거나 같으면 제거(작으면 제거 안함)
            while (list.size() > 0 && list.peek() <= numbers[i]) {
                list.pop();
            }
            // list에 값이 있으면 answer의 i값에 마지막값으로 변경
            if (list.size() > 0)
                answer[i] = list.peek();
            else // list에 값이 없으면 -1을 추가
                answer[i] = -1;
            list.push(numbers[i]);
        }
        return answer;
    }
}
