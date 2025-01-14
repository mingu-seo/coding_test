package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P12936 {
    public static void main(String[] args) {
        P12936 p = new P12936();
        int[] result = p.solution(3, 5);
        for (int r : result) {
            System.out.println(r);
        }
    }

    /*
     * 정답은 맞으나, 효울성 문제(시간 초과)
     * 수열은 구할때 다 구하지말고, k순서에 해당하는것만 구할까
     * 수열 구할때 k값 체크해서 중지 시키고, 마지막값으로 처리했는데도 효율선 체크에서 전부 시간초과, 
     * current를 스택으로 해 볼까? -> 스택으로해도 시간초과
     * 
     * 전체 순열을 구하는 방법은 O(n!) 복잡도 너무 비효율적, 개선이 안됨
     * 팩토리얼 적용
     * Factorial Number System을 사용하면 순열의 특정 위치를 직접 계산할 수 있습니다. 이를 통해 전체 순열을 하나하나 생성하지 않고도, k번째 순열을 빠르게 찾을 수 있습니다.

    팩토리얼 계산: 순열의 총 개수는 n! (n 팩토리얼)입니다. 예를 들어, n=3일 때 가능한 순열의 수는 3! = 6입니다.
    자리별 계산: 각 자리의 숫자를 정할 때마다 가능한 경우의 수가 줄어듭니다. 이를 통해 각 자리의 숫자를 계산하고, 남은 순열에서 다음 숫자를 선택합니다.
    리스트에서 숫자 선택 및 제거: 선택한 숫자는 리스트에서 제거하여 다음 자리에서는 중복이 없도록 합니다.
     */

    public int[] solution(int n, long k) {
        int[] answer = new int[n];  // 결과를 저장할 배열
        List<Integer> numbers = new ArrayList<>();  // 숫자 후보군 리스트
        long factorial = 1;

        // 초기 숫자 리스트와 팩토리얼 계산
        // 1부터 n까지의 숫자를 리스트에 추가하고, 동시에 n! 값을 계산합니다.
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            factorial *= i;
        }

        k--;  // k값을 0-based 인덱스로 맞추기 위해 1을 빼줍니다.

        // 각 자리의 숫자를 결정합니다.
        for (int i = 0; i < n; i++) {
            factorial /= (n - i);  // 현재 자리에서의 경우의 수를 계산
            int index = (int)(k / factorial);  // 현재 자리의 숫자를 결정하는 인덱스 계산
            answer[i] = numbers.remove(index);  // 결정된 숫자를 결과 배열에 추가하고, 리스트에서 제거
            k %= factorial;  // 남은 순열의 순서를 재조정
        }

        return answer;  // k번째 순열 결과 반환
    }
}
