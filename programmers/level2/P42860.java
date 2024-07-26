package level2;

public class P42860 {
    public static void main(String[] args) {
        P42860 p = new P42860();
        int result = p.solution("BBBBAAAAAAAB");
        System.out.println(result);
    }

    public int solution(String name) {
        int answer = 0;

        int updown = 0; // 위아래
        int leftright = name.length() - 1; // 왼오른 (차례대로 이동하면 길이-1만큼 이동함)

        for (int i = 0; i < name.length(); i++) {
            int up = name.charAt(i) - 'A'; // 위(이전)으로 가는거리
            int down = 'Z' - name.charAt(i) + 1; // 아래(다음)으로 가는거리
            updown += Math.min(up, down); // 이전, 다음 거리 중 최소거리

            // 오른쪽으로 이동하는 것과 뒤로이동하는 것 중 최소거리 구하기
            int nextIndex = i + 1;
            // 다음문자 A인지 체크
            while (nextIndex < name.length() && name.charAt(nextIndex) == 'A') {
                nextIndex++;
            }

            // 현재위치에서 다음문자(A가 아닌)로 이동하는것과 뒤로 이동하는것 중 최소거리 구하기
            leftright = Math.min(leftright, name.length() - nextIndex + i * 2); // 전체길이에서 양옆의 이동거리구하기
            leftright = Math.min(leftright, (name.length() - nextIndex) * 2 + i);
        }
        answer = updown + leftright;
        return answer;
    }
}
