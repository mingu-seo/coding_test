package level2;

import java.util.Arrays;

/*
 * 이 클래스는 주어진 'storey' 숫자를 0으로 만들기 위한 최소의 조작 횟수를 계산하는 문제를 해결합니다.
 * 주어진 'storey' 숫자를 각 자리별로 변환하여, 숫자를 0으로 만드는 과정에서
 * 'up' 또는 'down' 방향으로 조작하는 두 가지 경우를 시뮬레이션하여 최소 조작 횟수를 찾습니다.
 */

public class P148653 {
    public static void main(String[] args) {
        P148653 p = new P148653();
        int result = p.solution(555);
        System.out.println(result);
    }

    int min = Integer.MAX_VALUE; // 최소 조작 횟수를 저장하는 변수
    /*
     * 주어진 storey 숫자를 문자열로 변환한 후, 각 자리수를 배열에 저장하고
     * 'up'과 'down' 두 가지 방향으로 시뮬레이션을 수행하여 최소 조작 횟수를 계산합니다.
     */
    public int solution(int storey) {
        int answer = 0;
        String storeyStr = String.valueOf(storey); // storey 숫자를 문자열로 변환
        int[] arr = new int[storeyStr.length()]; // 각 자리수를 저장할 배열 생성

        // 문자열의 각 문자를 정수로 변환하여 배열에 저장
        for (int i=storeyStr.length()-1; i>=0; i--) {
            int s = Integer.parseInt(String.valueOf(storeyStr.charAt(i)));
            arr[storeyStr.length()-1-i] = s;
            
        }

        // System.out.println(Arrays.toString(arr));

        boolean isPlus = false; // 초기 방향을 'down'으로 설정

        // 'up' 방향과 'down' 방향 각각에 대해 계산을 수행
        calculate(Arrays.copyOf(arr,arr.length), "up", 0, 0, isPlus);
        calculate(Arrays.copyOf(arr,arr.length), "down", 0, 0, isPlus);

        answer = min;

        return answer;
    }

    /*
     * 재귀적으로 각 자리수를 0으로 만들기 위한 조작 횟수를 계산합니다.
     * 주어진 방향(direct)에 따라 각 자리수의 값을 조작합니다.
     * 계산을 수행한 후, 다음 자리수로 넘어가며 재귀 호출합니다.
     */
    void calculate(int[] arr, String direct, int count, int idx, boolean isPlus) {
        // 모든 자리수를 처리한 경우, 최소 조작 횟수를 갱신
        if (idx == arr.length) {
            // System.out.println("count:"+count);
            if (min > count) min = count;
            return;
        }
        // 이전 계산에서 'isPlus'가 true일 경우 현재 자리수에 1을 더함
        if (isPlus) {
            arr[idx] += 1;
        }
        // 현재 자리수의 값
        int v = arr[idx];
        
        // 자리수의 값이 10 이상일 경우 'isPlus'를 true로 설정
        if (v + 1 >= 10) {
            isPlus = true;
        }

        // 방향에 따라 조작 횟수를 계산
        if ("up".equals(direct)) {
            // 'up' 방향일 경우, 현재 자리수 값을 0으로 만들기 위해 (10 - v) 만큼 추가
            count += (10-v);
            isPlus = true;

             // 마지막 자리수일 경우, 조작 횟수를 추가
            if (idx == arr.length-1) {
                count++;
            }
        } else if ("down".equals(direct)) {
            // 'down' 방향일 경우, 현재 자리수 값을 0으로 만들기 위해 v 만큼 추가
            count = count + v;
            isPlus = false;
        }
        System.out.println(idx+","+direct+","+count+","+Arrays.toString(arr)+","+isPlus);
        calculate(Arrays.copyOf(arr,arr.length), "up", count, idx+1, isPlus);
        calculate(Arrays.copyOf(arr,arr.length), "down", count, idx+1, isPlus);
    }
}
