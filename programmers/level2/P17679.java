package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P17679 {

    public static void main(String[] args) {
        P17679 p = new P17679();
        // int result = p.solution(4, 5, new String[] { "CCBDE", "AAADE", "AAABF",
        // "CCBBF" });
        // int result = p.solution(6, 6, new String[] { "TTTANT", "RRFACC", "RRRFCC",
        // "TRRRAA", "TTMMMF", "TMMTTJ" });
        int result = p.solution(8, 5,
                new String[] { "HGNHU", "CRSHV", "UKHVL", "MJHQB", "GSHOT", "MQMJJ", "AGJKK", "QULKK" });
        System.out.println(result);
    }

    public int solution(int m, int n, String[] board) {
        int answer = 0;
        int[][] compare = { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 0 } };

        // 문자열을 배열로 변환해서 2차원 배열로 저장
        String[][] block = new String[board.length][board[0].length()];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                block[i][j] = String.valueOf(board[i].charAt(j));
            }
        }
        // for (String[] b : block) {
        // System.out.println(Arrays.toString(b));
        // }

        // 블록이 더이상 제거되지 않을때까지 반복
        while (true) {
            boolean isRemove = false; // 제거여부
            List<int[][]> removePoint = new ArrayList<>(); // 제거할 블록의 좌표
            for (int i = 0; i < block.length - 1; i++) {
                for (int j = 0; j < block[i].length - 1; j++) {
                    String b1 = block[i + compare[0][0]][j + compare[0][1]];
                    String b2 = block[i + compare[1][0]][j + compare[1][1]];
                    String b3 = block[i + compare[2][0]][j + compare[2][1]];
                    String b4 = block[i + compare[3][0]][j + compare[3][1]];
                    if (!"".equals(b1) && b1.equals(b2) && b2.equals(b3) && b3.equals(b4)) { // 4개의 블록이 전부 같으면
                        isRemove = true;
                        // System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

                        int[][] point = {
                                { i + compare[0][0], j + compare[0][1] },
                                { i + compare[1][0], j + compare[1][1] },
                                { i + compare[2][0], j + compare[2][1] },
                                { i + compare[3][0], j + compare[3][1] }
                        };
                        removePoint.add(point);
                    }
                }
            }
            // 4개가 같은 블록이 존재하면
            if (isRemove) {
                // removePoint에 있는블록 제거
                for (int i = 0; i < removePoint.size(); i++) {
                    int[][] point = removePoint.get(i);
                    block[point[0][0]][point[0][1]] = "";
                    block[point[1][0]][point[1][1]] = "";
                    block[point[2][0]][point[2][1]] = "";
                    block[point[3][0]][point[3][1]] = "";
                }
            }
            // 위칸 비어있으면 자리이동 (아래부터 위쪽으로 비교)
            for (int i = block.length - 1; i > 0; i--) {
                for (int j = 0; j < block[i].length; j++) {
                    if ("".equals(block[i][j])) {
                        for (int k = i - 1; k >= 0; k--) {
                            if (!"".equals(block[k][j])) {
                                String temp = block[k][j];
                                block[k][j] = block[i][j];
                                block[i][j] = temp;
                                break;
                            }
                        }

                    }
                }
            }

            if (!isRemove)
                break;
        }

        // 빈자리 개수 확인
        for (String[] b : block) {
            // System.out.println(Arrays.toString(b));
            for (String s : b) {
                if ("".equals(s)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}