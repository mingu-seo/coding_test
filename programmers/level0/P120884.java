package level0;


public class P120884 {

    public static void main(String[] args) {
        int r = solution(1999);
        
        System.out.println(r);
        
    }

    public static int solution(int chicken) {
        int answer = 0;
        int enuri = 0; // 나머지 치킨수
        for (int i=chicken; i>=1; i/=10) {
            answer += i/10;
            enuri += i % 10;
            System.out.println("쿠폰수:"+i+" 치킨수:"+answer+" 나머지"+enuri);
        }
        // 나머지 치킨에도 쿠폰으로 살수있으므로
        enuri = enuri+(enuri/10);
        return answer + enuri/10;
    }
}