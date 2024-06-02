package level1;

/**
 */
public class P134240 {

    public static void main(String[] args) {
        String result = solution(new int[]{1,7,1,2});
        System.out.println(result);
        
    }

    public static String solution(int[] food) {
        String answer = "1";
        StringBuffer sb = new StringBuffer();
        for (int i=1; i<food.length; i++) {
            int size = food[i];
            if (size % 2 != 0) size = size-1;
            size = size / 2;
            for (int j=0; j<size; j++) {
                sb.append(i);
            }
        }
        String temp = sb.toString();
        sb.append("0");
        for (int i=temp.length()-1; i>=0; i--) {
            sb.append(temp.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
}