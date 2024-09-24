package level2;

public class P159993 {
    public static void main(String[] args) {
        P159993 p = new P159993();
        int r = p.solution(new String[]{"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"});
        System.out.println(r);
    }
    /*
     * 길찾기에서 레버처리부분을 추가?
     * 예전에 미로찾기 문제를 재귀로 풀었었나? 그거 응용하면 가능하지 않을까?
     */

    public int solution(String[] maps) {
        int answer = 0;
        String[][] map = new String[maps.length][maps[0].length()];
        for (int i=0; i<maps.length; i++) {
            for (int j=0; j<maps[i].length(); j++) {
                map[i][j] = String.valueOf(maps[i].charAt(j));
            }
        }

        for (int i=0; i<map.length; i++) {
            for (int j=0; j<map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        return answer;
    }
}
