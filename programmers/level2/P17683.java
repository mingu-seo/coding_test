package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P17683 {
    public static void main(String[] args) {
        P17683 p = new P17683();
        // String result = p.solution("ABCDEFG", new String[] {
        //         "12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF" });
        String result = p.solution("CC#BCC#BCC#BCC#B",
        new String[] { "03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B" });
        System.out.println(result);
    }

    List<String> arr = Arrays.asList("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B");

    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";

        // 음분리
        List<String> mList = mSplit(m);

        System.out.println(mList);

        for (int i = 0; i < musicinfos.length; i++) {
            String[] musicinfo = musicinfos[i].split(",");
            System.out.println(Arrays.toString(musicinfo));

            int startHour = Integer.parseInt(musicinfo[0].split(":")[0]);
            int startMinute = Integer.parseInt(musicinfo[0].split(":")[1]);
            int endHour = Integer.parseInt(musicinfo[1].split(":")[0]);
            int endMinute = Integer.parseInt(musicinfo[1].split(":")[1]);

            // 총 플레이 시간
            int playTime = 0;
            if (endMinute < startMinute) {
                startHour--;
                playTime = endMinute + 60 - startMinute;
            } else {
                playTime = endMinute - startMinute;
            }
            playTime += (endHour - startHour) * 60;
            System.out.println("playTime:" + playTime);

            // 실제재생된 음구하기
            // 입력값음분리
            List<String> mSplit = mSplit(musicinfo[3]);
            System.out.println(mSplit);
            // 플레이시간만큼 음추가
            int idx = 0;
            // 비교하기 전에 원래 음저장해놓은 변수
            List<String> mSplitOrg = new ArrayList<>(mSplit);
            while (mSplit.size() < playTime) {
                System.out.println(mSplitOrg+", idx:"+idx);
                mSplit.add(mSplitOrg.get(idx++));
                if (idx == mSplitOrg.size()) {
                    idx = 0;
                }
            }
            System.out.println(mSplit);

            boolean isSub = isSubarray(mSplit, mList);
            System.out.println("isSub:"+isSub);
            if (isSub) {
                answer = musicinfo[2];
            }
        }
        return answer;
    }

    // 음분리
    List<String> mSplit(String m) {
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
        return mList;
    }

    // 부분배열인지 여부
    boolean isSubarray(List<String> a, List<String> b) {
        int n = a.size();
        int m = b.size();

        // b 배열이 a 배열보다 길면 부분 배열이 될 수 없음
        if (m > n) {
            return false;
        }

        // a 배열에서 b 배열이 부분 배열인지 확인
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (!a.get(i+j).equals(b.get(j))) {
                    break;
                }
            }

            // b 배열이 a 배열의 부분 배열일 경우
            if (j == m) {
                return true;
            }
        }

        return false;
    }
}
