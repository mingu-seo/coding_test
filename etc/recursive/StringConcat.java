package etc.recursive;

public class StringConcat {
    public static void main(String[] args) {
        // i(0~9) 변수를 문자열로 결합시키는 경우

        // for문
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += i;
        }

        System.out.println(result);

        String result2 = concat("", 0);
        System.out.println(result2);

    }

    static String concat(String str, int n) {
        if (n == 9) {
            return str + n;
        }
        return concat(str + n, n + 1);
    }

}
