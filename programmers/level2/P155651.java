package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P155651 {
    public static void main(String[] args) {
        P155651 p = new P155651();
        // int result = p.solution(new String[][]{{"01:00", "02:01"}, {"02:10", "03:00"},{"03:10", "04:00"}});
        // int result = p.solution(new String[][]{{"00:00", "00:07"}, {"00:01", "00:08"},{"00:02", "00:09"},{"10:26", "10:41"}});
        // int result = p.solution(new String[][]{{"09:10", "10:10"}, {"10:20", "12:20"}});
        int result = p.solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, 
                                        {"14:10", "19:20"}, {"18:20", "21:20"}});
        System.out.println(result);
    }
    public int solution(String[][] book_time) {
        // 정렬
        Arrays.sort(book_time, new Comparator<String[]>() {
            
            @Override
            public int compare(String[] o1, String[] o2)  {
                String[] start_t1 = o1[0].split(":");
                int start1 = Integer.parseInt(start_t1[0]) * 60 + Integer.parseInt(start_t1[1]);

                String[] start_t2 = o2[0].split(":");
                int start2 = Integer.parseInt(start_t2[0]) * 60 + Integer.parseInt(start_t2[1]);
                
                return start1 - start2;
            }

        });

        // for (String[] book : book_time) {
        //     System.out.println(Arrays.toString(book));
        // }


        int answer = 0;
        List<List<String[]>> book = new ArrayList<>();
        List<String[]> temp = new ArrayList<>();
        temp.add(book_time[0]);
        book.add(temp);

        for (int i=1; i<book_time.length; i++) {
            boolean isAdd = true;
            for (int j=0; j<book.size(); j++) { 
                int ableCount = 0; // 0 : 대실 가능
                for (int k=0; k<book.get(j).size(); k++) {
                    if (compareTime(book.get(j).get(k), book_time[i])) { // 가능
                        ableCount++;
                    }
                }
                if (ableCount == book.get(j).size()) { // 모든 예약건에 겹치지 않으면
                    book.get(j).add(book_time[i]);
                    isAdd = false;
                }
            }
            if (isAdd) {
                temp = new ArrayList<>();
                temp.add(book_time[i]);
                book.add(temp);
            }
        }
        // for (List<String[]> list : book) {
        //     for (String[] b : list) {
        //         System.out.print(Arrays.toString(b));
        //     }
        //     System.out.println();
        // }
        answer = book.size();
        return answer;
    }

    // 시간이 겹치는지 비교
    public boolean compareTime(String[] t1, String[] t2) {
        String[] start_t1 = t1[0].split(":");
        String[] end_t1 = t1[1].split(":");
        int start1 = Integer.parseInt(start_t1[0]) * 60 + Integer.parseInt(start_t1[1]);
        int end1 = Integer.parseInt(end_t1[0]) * 60;
        int min = Integer.parseInt(end_t1[1])+10;
        if (min >= 60) {
            start1++;
            end1 = end1 - 60;
        }

        String[] start_t2 = t2[0].split(":");
        String[] end_t2 = t2[1].split(":");
        int start2 = Integer.parseInt(start_t2[0]) * 60 + Integer.parseInt(start_t2[1]);
        int end2 = Integer.parseInt(end_t2[0]) * 60 + Integer.parseInt(end_t2[1]);

        // System.out.println(t1[0]+":"+t1[1]+" - "+t2[0]+":"+t2[1]);
        // System.out.println("start1:"+start1);
        // System.out.println("end1:"+end1);
        // System.out.println("start2:"+start2);
        // System.out.println("end2:"+end2);

        // t2의 시간이 t1의 시간 사이에 있는지
        if (
            (start1 <= start2 && end1 > start2) ||
            (start1 <= end2 && end1 > end2) ||
            (start1 > start2 && end1 < end2)
        ) {
            return false;
        }

        return true;
    }
}
