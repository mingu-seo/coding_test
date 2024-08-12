package level2;

import java.util.Arrays;

/*
 * 
 */

public class P148653 {
    public static void main(String[] args) {
        P148653 p = new P148653();
        int result = p.solution(16);
        System.out.println(result);
    }

    int min = Integer.MAX_VALUE;
    public int solution(int storey) {
        int answer = 0;
        String storeyStr = String.valueOf(storey);
        int[] arr = new int[storeyStr.length()];

        for (int i=storeyStr.length()-1; i>=0; i--) {
            int s = Integer.parseInt(String.valueOf(storeyStr.charAt(i)));
            arr[storeyStr.length()-1-i] = s;
            
        }

        // System.out.println(Arrays.toString(arr));

        String direct = "up";
        if (arr[0] < 5) direct = "down";
        calculate(Arrays.copyOf(arr,arr.length), direct, 0, 0, false);

        answer = min;

        return answer;
    }

    void calculate(int[] arr, String direct, int count, int idx, boolean isPlus) {
        if (idx == arr.length) {
            // System.out.println("count:"+count);
            if (min > count) min = count;
            return;
        }
        if (isPlus) {
            arr[idx] += 1;
        }
        int v = arr[idx];
        
        if (v + 1 >= 10) {
            isPlus = true;
        }

        if ("up".equals(direct)) {
            count += (10-v);
            if (idx == arr.length-1 && arr[idx] == 9) count++;
        } else if ("down".equals(direct)) {
            count = count + v;
        }
        System.out.println(idx+","+direct+","+count+","+Arrays.toString(arr)+","+isPlus);
        calculate(Arrays.copyOf(arr,arr.length), "up", count, idx+1, isPlus);
        calculate(Arrays.copyOf(arr,arr.length), "down", count, idx+1, isPlus);
    }
}
