package level1;

import java.util.Scanner;

/**
 */
public class P12969 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // for (int i=0; i<b; i++) {
        //     for (int j=0; j<a; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<b; i++) {
            for (int j=0; j<a; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}