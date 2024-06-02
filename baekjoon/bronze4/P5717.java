package baekjoon.bronze4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5717 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        while (true) {
            String[] values = scan.nextLine().split(" ");
            int v0 = Integer.parseInt(values[0]);
            int v1 = Integer.parseInt(values[1]);
            if (v0 == 0 && v1 == 0) {
                break;
            }
            result.add(v0+v1);
        }
        result.stream().forEach(i->System.out.println(i));
        scan.close();
    }
}
