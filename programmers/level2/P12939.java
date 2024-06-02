package level2;

/**
 * P12939
 */
public class P12939 {

    public static void main(String[] args) {
        P12939 p = new P12939();
        String result = p.solution("-1 -2 -3 -4");
        System.out.println(result);
    }

    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];
        for (int i=0; i<sArr.length; i++) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }
        java.util.Arrays.sort(iArr);
        answer = iArr[0]+" "+iArr[iArr.length-1];
        return answer;
    }
}