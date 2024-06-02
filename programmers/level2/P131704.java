package level2;

import java.util.Stack;

public class P131704 {
    public static void main(String[] args) {
        P131704 p = new P131704();
        // int result = p.solution(new int[] { 4, 3, 1, 2, 5 });
        int result = p.solution(new int[] { 5, 4, 3, 2, 1 });
        System.out.println(result);
    }

    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int index = 0;

        for (int i = 1; i <= order.length; i++) { // 1부터 시작하므로 order개수가 전체 번호와 같음
            stack.push(i); // 스택에 값 추가
            System.out.println("현재 stack:" + stack);
            // 스택에 값이 존재하고 order 앞에서부터 차례대로 스택의 마지막값과 일치하는지 확인
            while (stack.size() > 0 && order[index] == stack.elementAt(stack.size() - 1)) {
                stack.pop(); // 일치하면 스택에서 마지막값 제거
                index++; // order의 다음값과 비교하기 위해 1증가
            }
            System.out.println("while후 stack:" + stack);
        }
        answer = index;
        return answer;
    }
}
