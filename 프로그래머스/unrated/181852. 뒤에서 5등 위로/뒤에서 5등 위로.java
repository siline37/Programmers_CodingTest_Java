import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[num_list.length - 5];
        int index = 0;
        for(int loop=5; loop<num_list.length; loop++) {
            answer[index++] = num_list[loop];
        }        
        return answer;
    }
}