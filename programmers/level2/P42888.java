package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P42888 {
    public static void main(String[] args) {
        P42888 p = new P42888();
        String[] result = p.solution(new String[] { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
                "Enter uid1234 Prodo", "Change uid4567 Ryan" });
        for (String r : result) {
            System.out.println(r);
        }
    }

    public String[] solution(String[] record) {

        Map<String, String> id = new HashMap<>();
        List<String[]> history = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            String[] r = record[i].split(" ");
            if ("Enter".equals(r[0]) || "Leave".equals(r[0])) {
                String msg = "Enter".equals(r[0]) ? "들어왔습니다." : "나갔습니다.";
                history.add(new String[] { r[1], msg });
            }
            // System.out.println(Arrays.toString(r));
            if ("Enter".equals(r[0]) || "Change".equals(r[0])) {
                id.put(r[1], r[2]);
            }
        }

        String[] answer = new String[history.size()];
        for (int i = 0; i < history.size(); i++) {
            // System.out.println(id.get(history.get(i)[0]) + "님이 " + history.get(i)[1]);
            answer[i] = id.get(history.get(i)[0]) + "님이 " + history.get(i)[1];
        }
        return answer;
    }
}
