package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P4994 {
    public static void main(String[] args) {
        P4994 p = new P4994();
        int result = p.solution("ULURRDLLU");
        System.out.println(result);
    }

    public int solution(String dirs) {
        int answer = 0;

        Map<String, int[]> direct = new HashMap<>();
        direct.put("U", new int[] { 0, 1 });
        direct.put("D", new int[] { 0, -1 });
        direct.put("R", new int[] { 1, 0 });
        direct.put("L", new int[] { -1, 0 });
        List<String> visited = new ArrayList<>();

        int[] loc = { 0, 0 };
        for (int i = 0; i < dirs.length(); i++) {
            String s = String.valueOf(dirs.charAt(i));
            int prevX = loc[0];
            int prevY = loc[1];

            loc[0] = loc[0] + direct.get(s)[0];
            loc[1] = loc[1] + direct.get(s)[1];

            if (loc[0] < -5 || loc[1] < -5) {
                if (loc[0] < -5)
                    loc[0] = -5;
                if (loc[1] < -5)
                    loc[1] = -5;
                continue;
            }
            if (loc[0] > 5 || loc[1] > 5) {
                if (loc[0] > 5)
                    loc[0] = 5;
                if (loc[1] > 5)
                    loc[1] = 5;
                continue;
            }

            String prev = "" + prevX + prevY;
            String cur = "" + loc[0] + loc[1];

            // System.out.println(s + ":" + Arrays.toString(loc) + ", " + name);
            if (!visited.contains(prev + cur)) {
                answer++;
                visited.add(prev + cur);
                visited.add(cur + prev);
                // System.out.println(answer);
            }

        }
        return answer;
    }
}
