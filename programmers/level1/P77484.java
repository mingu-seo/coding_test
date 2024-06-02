package level1;

import java.util.*;

public class P77484 {
    public static void main(String[] args) {
        P77484 p = new P77484();
        int[] r = p.solution(new int[]{0, 0, 0, 0, 0, 0}, 
                            new int[]{38, 19, 20, 40, 15, 25});
        System.out.println(Arrays.toString(r));
    }
    public int[] solution(int[] lottos, int[] win_nums) {
        
        List<Integer> lottos2 = Arrays.asList(Arrays.stream(lottos).boxed().toArray(Integer[]::new));
        List<Integer> win_nums2 = Arrays.asList(Arrays.stream(win_nums).boxed().toArray(Integer[]::new));
        
        List<Integer> cor = new ArrayList<>(); // 맞은수
        List<Integer> bad = new ArrayList<>(); // 틀린수
        int zeroCount = 0; // 0개수

        for (int i=0; i<lottos2.size(); i++) {
            if (lottos2.get(i) == 0) {
                zeroCount++;
            } else if (win_nums2.contains(lottos2.get(i))) {
                cor.add(lottos2.get(i));
            } else {
                bad.add(lottos2.get(i));
            }
        }
        // System.out.println("맞은수:"+cor.size());
        // System.out.println("틀린수:"+bad.size());
        // System.out.println("0개수:"+zeroCount);
        int[] answer = {rank(cor.size()+zeroCount), rank(cor.size())};
        return answer;
    }

    int rank(int count) {
        switch (count) {
            case 6 :
            return 1;
            case 5 :
            return 2;
            case 4 :
            return 3;
            case 3 :
            return 4;
            case 2 :
            return 5;
            default:
            return 6;
        }
    }
}
