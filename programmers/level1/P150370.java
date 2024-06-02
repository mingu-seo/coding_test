package level1;

import java.time.LocalDate;
import java.util.*;
/*
 * 개인정보 수집 유효기간
 * 
 * 
 */
public class P150370 {
    public static void main(String[] args) {
        P150370 p = new P150370();
        int[] result = p.solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"});
        for (int r : result) {
            System.out.println(r);
        }
    }
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        String[] day = today.split("\\.");
        // LocalDate td = LocalDate.of(Integer.parseInt(day[0]), Integer.parseInt(day[1]), Integer.parseInt(day[2]));

        Map<String, Integer> term = new HashMap<>();
        for (int i=0; i<terms.length; i++) {
            String type = terms[i].substring(0,1);
            int month = Integer.parseInt(terms[i].substring(2));
            // System.out.println(type+","+month);
            term.put(type, month);
        }
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            String type = privacy[1];
            
            String[] p_date = privacy[0].split("\\.");
            LocalDate date = LocalDate.of(Integer.parseInt(p_date[0]), Integer.parseInt(p_date[1]), Integer.parseInt(p_date[2]));
            // 데이터의 일자에 약관개월수를 더해 오늘날짜보다 이후이면
            LocalDate d_day = date.plusMonths(term.get(type));
            // System.out.println(d_day+", "+day[0]+"-"+day[1]+"-"+day[2]);
            if (d_day.getYear() < Integer.parseInt(day[0])) {
                result.add(i+1);
            } else if (d_day.getYear() == Integer.parseInt(day[0])
                        && d_day.getMonthValue() < Integer.parseInt(day[1])) {
                result.add(i+1);
            } else if (d_day.getYear() == Integer.parseInt(day[0])
                    && d_day.getMonthValue() == Integer.parseInt(day[1])
                    && d_day.getDayOfMonth() <= Integer.parseInt(day[2]) ) {
                result.add(i+1);
            }
        }
        // System.out.println(td.plusMonths(6));
        answer  = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
