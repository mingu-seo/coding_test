package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P155651 {
    public static void main(String[] args) {
        P155651 p = new P155651();
        int result = p.solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, 
                                        {"14:10", "19:20"}, {"18:20", "21:20"}});
        System.out.println(result);
    }
    public int solution(String[][] book_time) {
        int answer = 0;
        List<List<String[]>> book = new ArrayList<>();
        List<String[]> temp = new ArrayList<>();
        temp.add(book_time[0]);
        book.add(temp);

        for (int i=1; i<book_time.length; i++) {
            
            listLoop :for (int j=0; j<book.size(); j++) {
                boolean isAdd = true;
                for (int k=0; k<book.get(j).size(); k++) {
                    if (compareTime(book.get(j).get(k), book_time[i]) == false) {
                        temp = new ArrayList<>();
                        temp.add(book_time[i]);
                        book.add(temp);
                        isAdd = false;
                        break listLoop;
                        

                    }
                }
                if (isAdd) {
                    book.get(j).add(book_time[i]);
                }
                
            }
            
        }
        for (List<String[]> list : book) {
            for (String[] b : list) {
                System.out.println(Arrays.toString(b));
            }
        }
        return answer;
    }

    // 시간이 겹치는지 비교
    public boolean compareTime(String[] t1, String[] t2) {
        String[] start_t1 = t1[0].split(":");
        String[] end_t1 = t1[1].split(":");
        int start1 = Integer.parseInt(start_t1[0]) * 60 + Integer.parseInt(start_t1[1]);
        int end1 = Integer.parseInt(end_t1[0]) * 60 + Integer.parseInt(end_t1[1]);

        String[] start_t2 = t2[0].split(":");
        String[] end_t2 = t2[1].split(":");
        int start2 = Integer.parseInt(start_t2[0]) * 60 + Integer.parseInt(start_t2[1]);
        int end2 = Integer.parseInt(end_t2[0]) * 60 + Integer.parseInt(end_t2[1]);

        System.out.println("start1:"+start1);
        System.out.println("end1:"+end1);
        System.out.println("start2:"+start2);
        System.out.println("end2:"+end2);

        // t2의 시간이 t1의 시간 사이에 있는지
        if (
            (start1 <= start2 && end1 >= start2) ||
            (start1 <= end2 && end1 >= end2)    
        ) {
            System.out.println("불가");
            return false;
        }

        return true;
    }
}
