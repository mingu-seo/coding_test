package level1;

import java.util.*;
/*
각 다이얼 좌표 미리 변수로 정해놓고
버튼 누를때 엄지위치 저장
가운데 버튼은 엄지위치와 가까운 거리를 위해 거리계산(유클리디안에서 맨하탄으로 변경)
 */
public class P67256 {
    public static void main(String[] args) {
        P67256 p = new P67256();
        String result = p.solution(new int[]{0,0},"right");
        System.out.println(result);
    }

    public String solution(int[] numbers, String hand) {
        String answer = "";
        Map<Integer, Integer[]> map = new HashMap<>();

        map.put(1, new Integer[]{0,0});
        map.put(2, new Integer[]{0,1});
        map.put(3, new Integer[]{0,2});
        map.put(4, new Integer[]{1,0});
        map.put(5, new Integer[]{1,1});
        map.put(6, new Integer[]{1,2});
        map.put(7, new Integer[]{2,0});
        map.put(8, new Integer[]{2,1});
        map.put(9, new Integer[]{2,2});
        map.put(0, new Integer[]{3,1});


        Integer[] leftPoint = {3,0};
        Integer[] rightPoint = {3,2};
        StringBuffer result = new StringBuffer();

        for (int i=0; i<numbers.length; i++) {
            Integer number = numbers[i];
            // System.out.print("("+leftPoint[0]+","+leftPoint[0]+") ("+rightPoint[0]+","+rightPoint[0]+"), "+number);
            if (number == 1 || number == 4 || number == 7) {
                leftPoint = map.get(number);
                result.append("L");
            } else if (number == 3 || number == 6 || number == 9) {
                rightPoint = map.get(number);
                result.append("R");
            } else {
                // 유클리디안 거리
                // double dis_left = Math.sqrt(Math.pow((Math.abs(map.get(number)[0] - leftPoint[0])),2)+Math.pow(Math.abs(map.get(number)[1] - leftPoint[1]),2));
                // double dis_right = Math.sqrt(Math.pow((Math.abs(map.get(number)[0] - rightPoint[0])),2)+Math.pow(Math.abs(map.get(number)[1] - rightPoint[1]),2));
                // 맨하탄 거리
                double dis_left = (Math.abs(map.get(number)[0] - leftPoint[0]))+Math.abs(map.get(number)[1] - leftPoint[1]);
                double dis_right = (Math.abs(map.get(number)[0] - rightPoint[0]))+Math.abs(map.get(number)[1] - rightPoint[1]);
                // System.out.print("left:"+dis_left+", right:"+dis_right);
                if (dis_left < dis_right) {
                    leftPoint = map.get(number);
                    result.append("L");
                } else if (dis_left > dis_right) {
                    rightPoint = map.get(number);
                    result.append("R");
                } else {
                    if ("left".equals(hand)) {
                        leftPoint = map.get(number);
                        result.append("L");
                    } else {
                        rightPoint = map.get(number);
                        result.append("R");
                    }
                    
                }
            }
            // System.out.println(","+result.toString().substring(result.toString().length()-1));
        }
        answer = result.toString();
        return answer;
    }
}
