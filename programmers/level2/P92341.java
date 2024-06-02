package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class P92341 {
    public static void main(String[] args) {
        P92341 p = new P92341();
        // int[] result = p.solution(new int[] { 180, 5000, 10, 600 },
        // new String[] { "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59
        // 5961 OUT", "07:59 0148 IN",
        // "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT" });
        // int[] result = p.solution(new int[] { 120, 0, 60, 591 },
        // new String[] { "16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00
        // 0202 OUT", "23:58 3961 IN" });
        int[] result = p.solution(new int[] { 1, 461, 1, 10 },
                new String[] { "00:00 1234 IN" });
        for (int r : result) {
            System.out.println(r);
        }
    }

    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};

        // 입/출차 기록 리스트(맵)에 저장
        List<Map<String, String[]>> recordsList = new ArrayList<>();
        for (int i = 0; i < records.length; i++) {
            String[] record = records[i].split(" ");
            if ("IN".equals(record[2])) {
                Map<String, String[]> map = new HashMap<>();
                map.put(record[1], new String[] { record[0], "23:59" });
                recordsList.add(map);
            } else { // OUT 인 경우 리스트 뒤에서 부터 같은 번호차량 내역 확인(최근 내역)
                for (int j = recordsList.size() - 1; j >= 0; j--) {
                    if (recordsList.get(j).get(record[1]) != null) {
                        recordsList.get(j).get(record[1])[1] = record[0];
                        break;
                    }
                }
            }
        }

        // 차량별 총주차시간(분) 구하기
        Map<String, Integer> totalMinute = new LinkedHashMap<>();
        for (int i = 0; i < recordsList.size(); i++) {
            Map<String, String[]> map = recordsList.get(i);
            for (Entry<String, String[]> entry : map.entrySet()) {
                String number = entry.getKey();
                // 주차시간 구하기
                String[] sTime = entry.getValue()[0].split(":");
                String[] eTime = entry.getValue()[1].split(":");
                int hour = Integer.parseInt(eTime[0]) - Integer.parseInt(sTime[0]);
                int minute = Integer.parseInt(eTime[1]) - Integer.parseInt(sTime[1]);
                if (minute < 0) {
                    hour--;
                    minute = 60 + minute;
                }
                int sumMinute = hour * 60 + minute;
                totalMinute.put(number, totalMinute.getOrDefault(number, 0) + sumMinute);
            }
        }
        // System.out.println(totalMinute);

        // 차량번호, 분으로 전처리된 데이터로 주차비용계산
        List<Map<String, Integer>> priceList = new ArrayList<>();
        for (Entry<String, Integer> entry : totalMinute.entrySet()) {
            Map<String, Integer> map = new HashMap<>();
            int minute = entry.getValue();
            int price = 0;
            if (fees[0] > minute) { // 기본시간보다 작으면
                price = fees[1];
            } else {
                price = fees[1] + ((minute - fees[0]) / fees[2] * fees[3]);
            }
            if ((minute - fees[0]) % fees[2] > 0) {
                price += fees[3];
            }
            map.put(entry.getKey(), price);
            priceList.add(map);
        }
        // 정렬(맵의 key로 오름차순 정렬)
        Collections.sort(priceList, (o1, o2) -> {
            int o1_number = 0;
            for (Entry<String, Integer> entry : o1.entrySet()) {
                o1_number = Integer.parseInt(entry.getKey());
            }

            int o2_number = 0;
            for (Entry<String, Integer> entry : o2.entrySet()) {
                o2_number = Integer.parseInt(entry.getKey());
            }
            return o1_number - o2_number;
        });
        // System.out.println(priceList);
        // value만 배열로 리턴
        answer = priceList.stream().mapToInt(m -> {
            int r = 0;
            for (Entry<String, Integer> entry : m.entrySet()) {
                r = entry.getValue();
            }
            return r;
        }).toArray();

        return answer;
    }
}
