import java.util.*;

class Solution {
    public String solution(int n) {
        String watermelon[] = new String[n];
        for(int loop=0; loop<n; loop++) {
            if((loop%2) == 0) {
                watermelon[loop] = "수";
            }else {
                watermelon[loop] = "박";
            }
        }
        
        String answer = String.join("", watermelon);
        return answer;
    }
}