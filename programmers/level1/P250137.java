package level1;

public class P250137 {
    public static void main(String[] args) {
        P250137 p = new P250137();
        // int r = p.solution(new int[]{5, 1, 5},
        //                 30,
        //                 new int[][]{
        //                     {2,10},{9,15},{10,5},{11,5}
        //                 });
        // int r = p.solution(new int[]{3, 2, 7},
        //                 20,
        //                 new int[][]{
        //                     {1,15},{5,16},{8,6}
        //                 });
        // int r = p.solution(new int[]{4, 2, 7},
        //                 20,
        //                 new int[][]{
        //                     {1,15},{5,16},{8,6}
        //                 });
        // int r = p.solution(new int[]{1, 1, 1},
        //                 5,
        //                 new int[][]{
        //                     {1,2},{3,2}
        //                 });
        int r = p.solution(new int[]{10, 10, 100},
                        10,
                        new int[][]{
                            {1,15},{3,1}
                        });
        System.out.println(r);
    }
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int maxHealth = health;
        int time = attacks[attacks.length-1][0];
        int conSuccess = 0;
        for (int i=0; i<=time; i++) {
            int attack = 0;
            // 몬스터 공격
            for (int[] a : attacks) {
                if (i == a[0]) {
                    attack = a[1];
                    conSuccess = 0;
                    break;
                }
            }
            
            if (attack > 0) {
                health = health - attack;
                // System.out.println("공격후:"+health);
                if (health < 0) {
                    break;
                }
                continue; // 붕대감기 시전안하고 다음 초로 건너띔
            }
            
            // 붕대 감기
            health = health + bandage[1] > maxHealth ? maxHealth : health + bandage[1];
            conSuccess += 1;
            
            if (conSuccess == bandage[0]) {
                health = health + bandage[2] > maxHealth ? maxHealth : health + bandage[2] ;
                conSuccess = 0;
            }
            // System.out.println("치료후:"+health);
        }
        answer = health <= 0 ? -1 : health;
        return answer;
    }
}
