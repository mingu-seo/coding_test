public class Test {
    public static void main(String[] args) {
        int r = solution(new int[]{10000, -13000, -4000, -2000, 6500, -20000}, 5000);
        System.out.println(r);
    }

    public static int solution(int[] ledger, int m) {
        int result = 0;
        for (int i=0; i<ledger.length; i++) {
            if (result + ledger[i] >= -m) {
                result += ledger[i];
            }
        }

        return result;
    }
}