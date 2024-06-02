package level1;

public class P161990 {
    public static void main(String[] args) {
        P161990 p = new P161990();
        int[] result = p.solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
        for (int r : result) {
            System.out.println(r);
        }
    }

    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        String[][] all = new String[wallpaper.length][wallpaper[0].length()];
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = 0;
        int maxY = 0;
        for (int i=0; i<wallpaper.length; i++) {
            for (int j=0; j<wallpaper[i].length(); j++) {
                all[i][j] = String.valueOf(wallpaper[i].charAt(j));
                if (all[i][j].equals("#")) {
                    if (minX > i) minX = i;
                    if (minY > j) minY = j;
                    if (maxX < i) maxX = i;
                    if (maxY < j) maxY = j;
                }
            }
        }

        // for (String[] a : all) {
        //     System.out.println(Arrays.toString(a));
        // }
        // 드래그하는 경우 최대값은 각 +1
        maxX++;
        maxY++;
        // System.out.println(minX+":"+minY+", "+maxX+":"+maxY);
        answer = new int[]{minX, minY, maxX, maxY};
        return answer;
    }
}
