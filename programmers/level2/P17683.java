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

    List<String> arr = Arrays.asList("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B");

    public String solution(String m, String[] musicinfos) {
        String answer = "";

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
            while (mSplit.size() < playTime) {
                mSplit.add(String.valueOf(musicinfo[3].charAt(idx++)));
                if (idx == musicinfo[3].length()) {
                    idx = 0;
                }
            }
            System.out.println(mSplit);

            for (int j = 0; j < mSplit.size(); j++) {
                int equalCount = 0;
                int mListIdx = 0;
                while (mListIdx < mList.size() - 1) {
                    System.out
                            .println("mSplit.get(j):" + mSplit.get(j) + " mList.get(mListIdx):" + mList.get(mListIdx));
                    if (mSplit.get(j).equals(mList.get(mListIdx))) {

                        equalCount++;
                    } else {
                        equalCount = 0;
                    }
                    if (equalCount == mList.size()) {
                        answer = musicinfo[2];
                    }
                    mListIdx++;
                }

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
}
