package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P92335 {
    public static void main(String[] args) {
        P92335 p = new P92335();
        // int result = p.solution(437674, 3);
        int result = p.solution(110011, 10);
        // int result = p.solution(883438, 3);
        System.out.println(result);
    }

    /*
     * public int solution(int n, int k) {
     * int answer = -1;
     * 
     * String value = "";
     * // System.out.println(Integer.toString(n, k));
     * // 진수 변환
     * while (n >= k) {
     * int temp = n % k;
     * value = temp + value;
     * n = n / k;
     * }
     * value = n + value;
     * // System.out.println(value);
     * 
     * List<Long> numbers = new ArrayList<>();
     * 
     * // 0P0
     * Pattern p = Pattern.compile("0[1-9]{1,}0");
     * Matcher m = p.matcher(value);
     * while (m.find()) {
     * // System.out.println("일치:" + m.group().substring(1, m.group().length() -
     * 1));
     * long number = Long.parseLong(m.group().substring(1, m.group().length() - 1));
     * if (isPrime(number))
     * numbers.add(number);
     * }
     * // P0
     * p = Pattern.compile("^[1-9]{1,}0");
     * m = p.matcher(value);
     * while (m.find()) {
     * // System.out.println("일치:" + m.group().substring(0, m.group().length() -
     * 1));
     * long number = Long.parseLong(m.group().substring(0, m.group().length() - 1));
     * if (isPrime(number))
     * numbers.add(number);
     * }
     * // 0P
     * p = Pattern.compile("0[1-9]{1,}$");
     * m = p.matcher(value);
     * while (m.find()) {
     * // System.out.println("일치:" + m.group().substring(1, m.group().length()));
     * long number = Long.parseLong(m.group().substring(1, m.group().length()));
     * if (isPrime(number))
     * numbers.add(number);
     * }
     * // P
     * p = Pattern.compile("^[1-9]{1,}$");
     * m = p.matcher(value);
     * while (m.find()) {
     * System.out.println("일치:" + m.group());
     * long number = Long.parseLong(m.group());
     * if (isPrime(number))
     * numbers.add(number);
     * }
     * // System.out.println(numbers);
     * answer = numbers.size();
     * return answer;
     * }
     */

    public int solution(int n, int k) {
        int answer = 0;

        String value = "";
        // System.out.println(Integer.toString(n, k));
        // 진수 변환
        while (n >= k) {
            int temp = n % k;
            value = temp + value;
            n = n / k;
        }
        value = n + value;
        // System.out.println(value);

        List<Long> numbers = new ArrayList<>();
        if (value.indexOf("0") > -1) {
            String[] values = value.split("0");
            for (String v : values) {
                if (!"".equals(v)) {
                    long v2 = Long.parseLong(v);
                    if (v2 > 1 && isPrime(v2)) {
                        numbers.add(v2);
                    }
                }
            }
        } else {
            Long v2 = Long.parseLong(value);
            if (v2 > 1 && isPrime(v2)) {
                numbers.add(v2);
            }
        }
        answer = numbers.size();
        return answer;
    }

    // 소수여부체크
    boolean isPrime(long n) {
        if (n < 2)
            return false;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
