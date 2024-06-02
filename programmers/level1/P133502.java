package level1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * 재료를 리스트에 저장
 * 인덱스를 증가하면서 현재값이 빵이면 
 * 이전 인덱스값들을 찾아 빵-야채-고기-빵이면 리스트에서 제거하면서 카운트
 */
public class P133502 {
    public static void main(String[] args) {
        P133502 p = new P133502();
        int result = p.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        System.out.println(result);
    }
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<ingredient.length; i++) {
            list.add(ingredient[i]);
            
        }
        int idx = 0;
        while (idx < list.size()) {
            System.out.println(Arrays.toString(list.toArray()));
            if (idx >= 3 && list.get(idx) == 1) {
                if (list.get(idx-1) == 3 &&
                    list.get(idx-2) == 2 &&
                    list.get(idx-3) == 1) {
                        answer++;
                        list.remove(idx);
                        list.remove(idx-1);
                        list.remove(idx-2);
                        list.remove(idx-3);
                        idx = idx - 4;
                    }
            }
            idx++;
        }

        return answer;
    }
}
