public class Solution {

    public static int solution(int[] A) {
        int val = 0;  //  int[] series = {9,3,9,3,9,7,9};
        boolean[] match = new boolean[A.length];

        for(int m=0; m < A.length; m++) {
            match[m] =  false;
        }

        for(int i=0; i < A.length; i++) {
            if (match[i]) {
                continue;
            }

            for(int j = i+1 ; j< A.length ; j++){
               if (match[j]) {
                    continue;
                }

                if ((A[i] == A[j]) && !match[j] && !match[i]) {
                    match[i] = true;
                    match[j] = true;
                    break;
                }
            }
        }

        for(int m=0; m < A.length; m++) {
            if (!match[m]) {
                val = A[m];
            }
        }

        return val;
    }

    public static void main(String[] args) {
        int[] series = {9,3,9,3,9,7,9};
        int ans = solution(series);
        System.out.println("Return should be:" + ans);
    }
}
