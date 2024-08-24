package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P17683 {
    public static void main(String[] args) {
        P17683 p = new P17683();
        String result = p.solution("ABCDEFG", new String[] {
                "12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF" });
        // String result = p.solution("CC#BCC#BCC#BCC#B",
        // new String[] { "03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B" });
        System.out.println(result);
    }

    public String solution(String m, String[] musicinfos) {
        String answer = "";
        List<String> arr = Arrays.asList("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B");
        List<String> mList = new ArrayList<>();

        for (int i = 0; i < m.length(); i++) {
            String mStr = "";
            String temp = String.valueOf(m.charAt(i));
            if (i < m.length() - 1 && "#".equals(String.valueOf(m.charAt(i + 1)))) {
                mStr = temp + "#";
                i++;
            } else {
                mStr = temp;
            }
            if (arr.contains(mStr)) {
                mList.add(mStr);
            }
        }
        System.out.println(mList);

        for (int i = 0; i < musicinfos.length; i++) {
            String[] musicinfo = musicinfos[i].split(",");
            System.out.println(Arrays.toString(musicinfo));
        }
        return answer;
    }
}
