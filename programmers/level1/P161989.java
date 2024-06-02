package level1;

/**
 */
public class P161989 {

    public static void main(String[] args) {
        int result = solution(4, 1, new int[]{1, 2, 3, 4});
        System.out.println(result);
        
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        // 전체배열 생성
        int[] arr = new int[n];
        // 페인트를 다시 칠해야할 위치 지정
        for (int i=0; i<section.length; i++) {
            arr[section[i]-1] = 1;
        }
        for (int i=0; i<=arr.length-m; i++) {
            if (arr[i] == 1) {
                for (int j=i; j<i+m; j++) {
                    arr[j] = 0; // 롤러길이만큼 페인트칠하기
                }
                answer++;
            }
            if (checkPainting(arr)) {
                break;
            }
            // 마지막 반복(-m)까지 돌았는데도 페인트칠할게 남았으면 마지막은 전부 칠하기
            if (i == arr.length-m && !checkPainting(arr)) {
                for (int j=i; j<i+m; j++) {
                    arr[j] = 0; // 롤러길이만큼 페인트칠하기
                }
                answer++;
            }
        }
        return answer;
    }

    /*
    
    */
    public static boolean checkPainting(int[] arr) {
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 1) {
                return false;
            }
        }

        return true;
    }
}