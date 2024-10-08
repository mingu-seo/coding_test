package level1;

/**
 * P340213
 */
public class P340213 {
    public static void main(String[] args) {
        P340213 p = new P340213();
        // String result = p.solution("34:33", "13:00", "00:55", "02:55", new String[] {
        // "next", "prev" });
        // String result = p.solution("10:55", "00:05", "00:15", "06:55", new String[] {
        // "prev", "next", "next" });
        // String result = p.solution(÷"07:22", "04:05", "00:15", "04:07", new String[] { "next" });
        String result = p.solution("30:00", "01:55", "01:00", "01:30", new String[] { "next" });
        System.out.println(result);
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        // 비디오 길이 정수로 변환
        String[] lenArr = video_len.split(":");
        int len_m = Integer.parseInt(lenArr[0]); // 비디오 길이분
        int len_s = Integer.parseInt(lenArr[1]); // 비디오 길이초

        // 위치 정수로 변환
        String[] posArr = pos.split(":");
        int pos_m = Integer.parseInt(posArr[0]); // 위치분
        int pos_s = Integer.parseInt(posArr[1]); // 위치초

        // 오프닝 정수로 변환
        String[] op_s_Arr = op_start.split(":");
        int op_s_m = Integer.parseInt(op_s_Arr[0]); // 오프닝시작분
        int op_s_s = Integer.parseInt(op_s_Arr[1]); // 오프닝시작초
        String[] op_e_Arr = op_end.split(":");
        int op_e_m = Integer.parseInt(op_e_Arr[0]); // 오프닝끝분
        int op_e_s = Integer.parseInt(op_e_Arr[1]); // 오프닝끝초

        // 오프닝 구간인지 체크 (반복전에도 미리 체크)
        int[] result = openingCheck(pos_m, pos_s, op_s_m, op_s_s, op_e_m, op_e_s);
        pos_m = result[0];
        pos_s = result[1];

        for (String command : commands) {
            if ("next".equals(command)) {
                pos_s += 10;
                if (pos_s >= 60) {
                    pos_m++;
                    pos_s -= 60;
                }

                if (pos_m >= len_m && pos_s > len_s) {
                    pos_m = len_m;
                    pos_s = len_s;
                }
            }
            if ("prev".equals(command)) {
                pos_s -= 10;
                if (pos_m == 0 && pos_s < 0) {
                    pos_s = 0;
                } else if (pos_s < 0) {
                    pos_m--;
                    pos_s += 60;
                }
            }
            // System.out.println("pos_m:"+pos_m+", pos_s:"+pos_s);
            // 오프닝 구간인지 체크
            result = openingCheck(pos_m, pos_s, op_s_m, op_s_s, op_e_m, op_e_s);
            pos_m = result[0];
            pos_s = result[1];
        }
        // System.out.println(pos_m + ":" + pos_s);
        answer = (pos_m < 10 ? "0" + pos_m : pos_m) + ":" + (pos_s < 10 ? "0" + pos_s : pos_s);
        return answer;
    }

    // 오프닝 구간인지 체크 (위치분, 위치초, 오프닝시작분, 오프닝시작초, 오프닝끝분, 오프닝끝초)
    int[] openingCheck(int pos_m, int pos_s, int op_s_m, int op_s_s, int op_e_m, int op_e_s) {
        // System.out.println("start:"+op_s_m+":"+op_s_s);
        // System.out.println("end:"+op_e_m+":"+op_e_s);
        // System.out.println("pos:"+pos_m+":"+pos_s);
        // 조건으로 처리하지말고 분으로 환산해서 비교하자
        int start = op_s_m * 60 + op_s_s;
        int end = op_e_m * 60 + op_e_s;
        int pos = pos_m * 60 + pos_s;
        if (start <= pos && pos <= end) { 
            // 오프닝끝 분/초로 변경
            System.out.println("타나");
            pos_m = op_e_m;
            pos_s = op_e_s;
        }
        return new int[] { pos_m, pos_s };
    }
}