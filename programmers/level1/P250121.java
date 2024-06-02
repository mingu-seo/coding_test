/*
 * [PCCE 기출문제] 10번 / 데이터 분석
 * 
 */

package level1;

import java.util.*;

public class P250121 {
    public static void main(String[] args) {
        P250121 p = new P250121();
        int[][] result = p.solution(new int[][]{
                            {1, 20300104, 100, 80},
                            {2, 20300804, 847, 37},
                            {3, 20300401, 10, 8}}, "date", 20300501, "remain");
        for (int[] r : result) {
            System.out.println(Arrays.toString(r));
        }
    }
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        Map<String, Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);

        List<List<Integer>> list = new ArrayList<>();
        for (int i=0; i<data.length; i++) {
            int idx = map.get(ext);
            if (data[i][idx] < val_ext) {
                List<Integer> list2 = new ArrayList<>();
                list2.add(data[i][0]);
                list2.add(data[i][1]);
                list2.add(data[i][2]);
                list2.add(data[i][3]);
                list.add(list2);
            }
        }
        Collections.sort(list, new Comparator<List<Integer>>(){

            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int idx = map.get(sort_by);
                if (o2.get(idx) > o1.get(idx)) {
                    return -1;
                } else if (o2.get(idx) < o1.get(idx)) {
                    return 1;
                } else {
                    return 0;
                }
            }

        });
        int[][] answer = new int[list.size()][4];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i).stream().mapToInt(v->v).toArray();
            // for (int j=0; j<list.get(i).size(); j++) {
            //     System.out.print(list.get(i).get(j)+",");
            // }
            // System.out.println();
        }
        return answer;
    }
}
